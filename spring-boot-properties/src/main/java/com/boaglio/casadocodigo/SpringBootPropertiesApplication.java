package com.boaglio.casadocodigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootPropertiesApplication
	extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	
		return application.sources(SpringBootPropertiesApplication.class);
		
	}
}
