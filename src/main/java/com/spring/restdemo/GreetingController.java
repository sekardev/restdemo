package com.spring.restdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	public Greeting greetings() {
		return new Greeting(12, "Hello World ");
		
	}

}
