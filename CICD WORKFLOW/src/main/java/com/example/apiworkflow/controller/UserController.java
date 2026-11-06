package com.example.apiworkflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {

        return Arrays.asList(
                new User(1, "Mugilan", "Java Developer"),
                new User(2, "Arun", "Angular Developer"),
                new User(3, "Kumar", "Spring Boot Developer")
        );
    }

    public record User(int id, String name, String role) {}
}