package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User register(@RequestBody User user) throws Exception {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // You can add logic to authenticate the user and return a JWT token or session here
        return "Login successful";
    }
}
