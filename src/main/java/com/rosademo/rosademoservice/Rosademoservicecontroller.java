package com.rosademo.rosademoservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Rosademoservicecontroller {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/addition/{first}/{second}")
	public int addition(@PathVariable String first, @PathVariable String second) {
		return Integer.parseInt(first)+Integer.parseInt(second);
	}
	
	@GetMapping("/subtraction/{first}/{second}")
	public int subtraction(@PathVariable String first, @PathVariable String second) {
		return Integer.parseInt(first)-Integer.parseInt(second);
	}
	
	@GetMapping("/multiplication/{first}/{second}")
	public int multiplication(@PathVariable String first, @PathVariable String second) {
		return Integer.parseInt(first)*Integer.parseInt(second);
	}
	
	@GetMapping("/division/{first}/{second}")
	public int division(@PathVariable String first, @PathVariable String second) {
		return Integer.parseInt(first)/Integer.parseInt(second);
	}
}
