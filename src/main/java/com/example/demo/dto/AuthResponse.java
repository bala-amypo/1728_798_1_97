package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    // Ignore these methods during JSON serialization
    @JsonIgnore
    public AuthResponse getBody() {
        return this;
    }

    @JsonIgnore
    public int getStatusCodeValue() {
        return 200; // or whatever default status code you want
    }
}
