package com.example.atvci;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AtvciApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

}
