package com.devops.assignment.devops_assignment.controllers;

import com.devops.assignment.devops_assignment.dtos.LoginRequest;
import com.devops.assignment.devops_assignment.dtos.RegisterRequest;
import com.devops.assignment.devops_assignment.services.impl.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.OK;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServicesImpl userServices;
   @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest){
        try {
            return new ResponseEntity<>(userServices.registerUser(registerRequest), OK);
        }catch ( Exception e ) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest registerRequest){
        try {
            return new ResponseEntity<>(userServices.logIn(registerRequest), OK);
        }catch ( Exception e ) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/hello")
    public String hello(){
       return "hello";
    }
}
