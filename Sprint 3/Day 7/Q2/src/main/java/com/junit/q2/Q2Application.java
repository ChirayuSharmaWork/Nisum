package com.junit.q2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Q2Application {

	public static void main(String[] args) {
		SpringApplication.run(Q2Application.class, args);
	}

}
