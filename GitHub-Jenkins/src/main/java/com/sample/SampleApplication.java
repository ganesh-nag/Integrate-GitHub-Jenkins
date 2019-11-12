package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleApplication {

	@RequestMapping("/")
	String home() {
		return "This is Eclipse GitHub Jenkins Maven SonarQube Integration!!!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class,args);

	}

}
