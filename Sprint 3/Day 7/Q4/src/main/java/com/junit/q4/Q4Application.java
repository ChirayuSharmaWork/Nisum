package com.junit.q4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Q4Application {

	public static void main(String[] args) {
		SpringApplication.run(Q4Application.class, args);
	}

}
