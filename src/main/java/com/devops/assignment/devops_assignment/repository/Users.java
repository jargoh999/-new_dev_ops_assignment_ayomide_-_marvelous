package com.devops.assignment.devops_assignment.repository;

import com.devops.assignment.devops_assignment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Users extends JpaRepository<User,Long> {
    User getUserByEmailIgnoreCase(String email);
    User getUserByUsernameIgnoreCase(String username);
}
