package com.springboot.devops.controllers;

import com.springboot.devops.utils.Utility;
import org.apache.catalina.mbeans.UserMBean;
//import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Utility.base_url)
public class UserController {


    @GetMapping("/user")
    public String getUserById(@RequestParam("userId") Long userId) {
        return "welcome to spring boot";
    }
}