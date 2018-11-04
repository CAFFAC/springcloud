package com.caf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SrpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrpingApplication.class, args);
	}
}
