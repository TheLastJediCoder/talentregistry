package com.javaproject.talentregistry.service;

import com.javaproject.talentregistry.model.User;
import com.javaproject.talentregistry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<User> singleUser(String id) {
        return userRepository.findById(Integer.parseInt(id));
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setSkill(user.getSkill());
        return userRepository.save(existingUser);
    }

    @Override
    public String deleteUser(String id) {
        userRepository.deleteById(Integer.parseInt(id));
        return "Deleted Successfully";
    }
}
