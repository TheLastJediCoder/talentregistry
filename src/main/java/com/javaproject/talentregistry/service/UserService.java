package com.javaproject.talentregistry.service;

import com.javaproject.talentregistry.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public User addUser(User user);

    public List<User> allUser();

    public List<User> searchUser(String[] skills, int no_skills);

    public Optional<User> singleUser(String id);

    public User updateUser(User user);

    public String deleteUser(String id);
}
