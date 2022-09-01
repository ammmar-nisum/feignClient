package com.java.learner.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServicesApplication.class, args);
	}

}
