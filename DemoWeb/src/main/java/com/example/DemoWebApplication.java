package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoWebApplication {
	@GetMapping("/hi")
	public String message() {
		return "welcome tospring boot project";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

}
