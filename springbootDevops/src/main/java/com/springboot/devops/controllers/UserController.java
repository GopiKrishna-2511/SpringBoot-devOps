package com.springboot.devops.controllers;

import com.springboot.devops.entity.User;
import com.springboot.devops.repository.UserRepository;
import com.springboot.devops.service.UserService;
import com.springboot.devops.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Utility.base_url)
public class UserController {

    @Autowired
    private  UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> userlist = userService.getUsersList();
        if (userlist != null) {
            return ResponseEntity.ok(userlist);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/user")
    public ResponseEntity<User> getById(@RequestParam("Id") Integer Id) {

        User user = userService.getUserById(Id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}