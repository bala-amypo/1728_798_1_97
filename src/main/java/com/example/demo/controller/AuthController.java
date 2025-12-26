package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.entity.User;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserServiceImpl userService;
    private final JwtUtil jwtUtil;

    // Constructor matches the test: takes service + jwtUtil
    public AuthController(UserServiceImpl userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        Optional<User> userOpt = userService.findByEmail(request.getEmail());

        if (userOpt.isEmpty() || !userOpt.get().getPassword().equals(request.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }

        User user = userOpt.get();
        String token = jwtUtil.generateToken(
                java.util.Map.of("email", user.getEmail(), "role", user.getRole()),
                user.getEmail()
        );

        return ResponseEntity.ok(java.util.Map.of("token", token));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole("STAFF"); // default role
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
