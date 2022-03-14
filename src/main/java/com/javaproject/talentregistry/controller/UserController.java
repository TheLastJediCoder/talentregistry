package com.javaproject.talentregistry.controller;

import com.javaproject.talentregistry.model.User;
import com.javaproject.talentregistry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    /** Method for adding new user */
    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.addUser(user);
        return "User Added Successfully";
    }

    /** Method for fetching all user */
    @GetMapping("/all")
    public List<User> all(){
        return userService.allUser();
    }

    /** Method for fetching user based on search */
    @PostMapping("/search")
    public List<User> search(@RequestBody String[] skills){
        if(skills.length == 0){
            return all();
        }
        else {
            return userService.searchUser(skills, skills.length);
        }
    }

    @PostMapping("/id")
    public Optional<User> single(@RequestBody String id){
        return userService.singleUser(id);
    }

    @PostMapping("/update")
    public User single(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/delete")
    public String delete(@RequestBody String id){
        return userService.deleteUser(id);
    }
}
