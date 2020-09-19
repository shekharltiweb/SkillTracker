package com.skilltracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@SpringBootApplication
public class SkilltrackerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SkilltrackerApplication.class, args);
	}

	
}
