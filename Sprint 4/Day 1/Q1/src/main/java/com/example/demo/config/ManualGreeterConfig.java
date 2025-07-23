package com.example.demo.config;

import com.example.demo.core.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualGreeterConfig {

    @Bean
    public Greeter greeterBean() {
        return () -> "Hello from @Bean Java config!";
    }
}
