package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(String email) {
        return "dummy-jwt-token-for-" + email;
    }

    public String extractUsername(String token) {
        return token.replace("dummy-jwt-token-for-", "");
    }
}
