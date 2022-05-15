package com.example.thinclient.controller;

import com.example.thinclient.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;

    @GetMapping
    public String main(){
        userRepository.findAll();
        return "Hello world";
    }

    @GetMapping("/test")
    public String mainh(){
        userRepository.findAll();
        return "Hello world";
    }
}
