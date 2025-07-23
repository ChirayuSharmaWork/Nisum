package com.junit.q3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Q3Application {

	public static void main(String[] args) {
		SpringApplication.run(Q3Application.class, args);
	}

}
