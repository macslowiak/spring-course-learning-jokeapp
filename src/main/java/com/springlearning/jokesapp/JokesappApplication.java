package com.springlearning.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JokesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesappApplication.class, args);
	}

}
