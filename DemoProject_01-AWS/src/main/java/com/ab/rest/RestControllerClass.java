package com.ab.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@GetMapping("/showHome")
	public String showHome() {
		return "Test on AWS cloud";
	}
}
