package com.sj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/hello")
public String sayHello() {
	return "Hello world....from jenkins";
	
}
	//written by another developer
	@GetMapping("/hi")
	public String sayHi(){
		return "Hi world";
}
	@GetMapping("/test")
	public String testGit() {
		return "testing sucessfull";
	}
}
