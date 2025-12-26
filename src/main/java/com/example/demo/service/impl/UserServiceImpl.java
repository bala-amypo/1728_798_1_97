package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public User register(User user) {
        userRepository.findByEmail(user.getEmail())
                .ifPresent(u -> { throw new RuntimeException("User email exists"); });

        if (user.getRole() == null) user.setRole("STAFF");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> 
                new ResourceNotFoundException("User not found"));
    }


        // Add this getter so AuthController can access the encoder
    public BCryptPasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }
}
