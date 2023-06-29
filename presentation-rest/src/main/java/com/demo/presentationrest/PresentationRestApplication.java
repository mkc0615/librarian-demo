package com.demo.presentationrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "com.demo.library")
@EntityScan(basePackages = "com.demo")
public class PresentationRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(PresentationRestApplication.class, args);
	}
}
