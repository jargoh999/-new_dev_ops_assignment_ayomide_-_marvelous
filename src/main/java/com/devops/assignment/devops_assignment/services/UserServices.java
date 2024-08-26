package com.devops.assignment.devops_assignment.services;

import com.devops.assignment.devops_assignment.dtos.LoginRequest;
import com.devops.assignment.devops_assignment.dtos.LoginResponse;
import com.devops.assignment.devops_assignment.dtos.RegisterRequest;
import com.devops.assignment.devops_assignment.dtos.RegisterResponse;

public interface UserServices {
    RegisterResponse registerUser(RegisterRequest registerRequest);
    LoginResponse logIn(LoginRequest loginRequest);
}
