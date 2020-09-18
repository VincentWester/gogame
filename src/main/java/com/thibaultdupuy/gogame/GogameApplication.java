package com.thibaultdupuy.gogame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.thibaultdupuy.gogame.model")   
public class GogameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GogameApplication.class, args);
	}

}
