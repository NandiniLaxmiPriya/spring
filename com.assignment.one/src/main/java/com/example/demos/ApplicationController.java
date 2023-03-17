package com.example.demos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping("/hello")
	public String helloo()
	{
		return "Hey hoi";
	}
}
