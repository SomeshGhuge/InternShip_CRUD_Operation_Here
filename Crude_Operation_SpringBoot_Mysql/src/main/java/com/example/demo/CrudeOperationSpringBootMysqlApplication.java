package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudeOperationSpringBootMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudeOperationSpringBootMysqlApplication.class, args);
	}

// Spring boot main class add this from 3.0.2 version

protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ClientDatabaseApplication.class);
	}

}
