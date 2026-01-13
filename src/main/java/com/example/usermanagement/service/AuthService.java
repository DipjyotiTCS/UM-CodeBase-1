package com.example.usermanagement.service;

import com.example.usermanagement.dto.*;

public interface AuthService {
    UserResponse register(RegisterRequest request);
    AuthResponse authenticate(LoginRequest request);
    TokenValidationResponse validate(String bearerTokenOrRawToken);
}
