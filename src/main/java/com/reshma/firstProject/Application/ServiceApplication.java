package com.reshma.firstProject.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.reshma")
@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class);
	}
}
