package com.springboot.devops.service;
import com.springboot.devops.entity.User;
import com.springboot.devops.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Integer Id) {
        return userRepository.findById(Id).get();
    }

    public List<User> getUsersList() {
        return userRepository.findAll();
    }


    public User save(User user) {
        return userRepository.save(user);
    }

}
