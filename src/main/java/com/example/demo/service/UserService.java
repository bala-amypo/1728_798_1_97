package com.example.demo.service;

import com.example.demo.enitity.User;

public interface UserService {
    User register(User user);
    User findByEmail(String email);
}