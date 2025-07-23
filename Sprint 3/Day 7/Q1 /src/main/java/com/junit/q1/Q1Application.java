package com.junit.q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Q1Application {

	public static void main(String[] args) {
		SpringApplication.run(Q1Application.class, args);
	}

}
