package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/world")
	public String world() { return "The world is yours to explore!"; }

	@GetMapping("/now")
	public String now() { return "The current time is not fixed!"; }
}
