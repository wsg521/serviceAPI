package com.serviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RestController
public class ServiceAPIApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAPIApp.class, args);
	}
}
