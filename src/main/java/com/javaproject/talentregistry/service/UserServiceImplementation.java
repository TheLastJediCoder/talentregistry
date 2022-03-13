package com.javaproject.talentregistry.service;

import com.javaproject.talentregistry.model.User;
import com.javaproject.talentregistry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> allUser(){
        return userRepository.findAll();
    }

    @Override
    public List<User> searchUser(String[] skills, int no_skills){
        return userRepository.findUserBySkills(skills, no_skills);
    }
}
