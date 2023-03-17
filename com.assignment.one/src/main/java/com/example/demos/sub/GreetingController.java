package com.example.demos.sub;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String message="Hello, %s!";
	private final AtomicLong count = new AtomicLong() ;
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="world") String name) {
		return new Greeting(count.incrementAndGet(),String.format(message, name));
	}
}
