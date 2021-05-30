package com.mavinasara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PersonalInvestmentTrackerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalInvestmentTrackerConfigServerApplication.class, args);
	}

}
