package com.example.demo.core;

import org.springframework.stereotype.Component;

@Component
public class GreeterService implements Greeter {
    public String greet() {
        return "Hello from @Component-based Greeter!";
    }
}
