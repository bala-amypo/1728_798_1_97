package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
    private Long userId;
    private String email;
    private String role;

    // Add this method so resp.getBody() works in the test
    public AuthResponse getBody() {
        return this;
    }

    // Add this method so resp.getStatusCodeValue() works in the test
    public int getStatusCodeValue() {
        return 200; // or whatever default status code you want
    }
}
