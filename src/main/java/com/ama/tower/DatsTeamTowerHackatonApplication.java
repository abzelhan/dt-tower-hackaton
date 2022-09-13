package com.ama.tower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatsTeamTowerHackatonApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DatsTeamTowerHackatonApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}
