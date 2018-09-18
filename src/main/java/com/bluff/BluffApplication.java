package com.bluff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class BluffApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluffApplication.class, args);
	}
}
