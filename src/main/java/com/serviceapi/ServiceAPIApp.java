package com.serviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceAPIApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAPIApp.class, args);
	}
}
