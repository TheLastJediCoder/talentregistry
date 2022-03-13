package com.javaproject.talentregistry.repository;

import com.javaproject.talentregistry.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /** Custom query to find user by skill */
    @Query(value = "SELECT * FROM user WHERE id in (SELECT user_id FROM skill WHERE name in ?1 GROUP BY user_id HAVING (COUNT(user_id)>=?2))", nativeQuery = true)
    public List<User> findUserBySkills(String[] skills, int no_skills);
}
