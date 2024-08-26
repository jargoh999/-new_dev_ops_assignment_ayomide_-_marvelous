package com.devops.assignment.devops_assignment.services.impl;

import com.devops.assignment.devops_assignment.dtos.LoginRequest;
import com.devops.assignment.devops_assignment.dtos.LoginResponse;
import com.devops.assignment.devops_assignment.dtos.RegisterRequest;
import com.devops.assignment.devops_assignment.dtos.RegisterResponse;
import com.devops.assignment.devops_assignment.model.User;
import com.devops.assignment.devops_assignment.repository.Users;
import com.devops.assignment.devops_assignment.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices {
    private final Users users;
    @Override
    public RegisterResponse registerUser(RegisterRequest registerRequest) {
        User user = User.builder().username(registerRequest.getUsername())
                .email(registerRequest.getEmail())
                .password(registerRequest.getPassword())
                .build();
        users.save(user);
        return RegisterResponse.builder().message("successfully registered")
                .build();

    }

    @Override
    public LoginResponse logIn(LoginRequest loginRequest) {
        return null;
    }


}
