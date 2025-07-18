package com.example.exceptionapi.controller;

import com.example.exceptionapi.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        if (id != 1) {
            throw new ResourceNotFoundException("ID not found: " + id);
        }
        return "Valid ID";
    }
}