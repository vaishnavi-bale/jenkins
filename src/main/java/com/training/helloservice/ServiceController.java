package com.training.helloservice;

import org.springframework.web.bind.annotation.GetMapping;

public class ServiceController {

	@GetMapping("/hello")
	public String message() {
		return "Hello Everyone";
	}
}
