package com.devops.assignment.devops_assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean isLoggedIn;
}
