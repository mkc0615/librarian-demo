package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class PresentationRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(PresentationRestApplication.class, args);
	}
}
