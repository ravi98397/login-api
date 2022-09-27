package com.api.login.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	@GetMapping("/hello")
	public String secrectMessage() {
		return "hello broo";
	}
	
	
}
