package com.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

	@GetMapping("/hello")
	public String hello() {
		return "welcome to restful API";
	}

	@PostMapping("/hello/{name}")
	public String addName(@PathVariable String name) {
		return "welcome to " + name;
	}
}
