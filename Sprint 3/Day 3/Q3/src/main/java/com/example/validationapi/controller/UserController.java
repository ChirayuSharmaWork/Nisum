package com.example.validationapi.controller;

import com.example.validationapi.model.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String addUser(@Valid @RequestBody User user) {
        return "User added successfully";
    }
}