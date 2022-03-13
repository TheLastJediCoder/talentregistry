package com.javaproject.talentregistry.repository;

import com.javaproject.talentregistry.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

    // Custom query to fetch unique skills
    @Query(value = "SELECT DISTINCT name FROM skill", nativeQuery = true)
    public List<String> findUniqueSkill();
}
