package com.example.demo.autoconfig;

import com.example.demo.core.Greeter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreeterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Greeter defaultGreeter() {
        return () -> "Hello from AutoConfiguration!";
    }
}
