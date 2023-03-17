package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mail.MailSender;
import com.example.demo.mail.MockMailSender;

import jakarta.mail.MessagingException;

@RestController
public class MockMailSenderController {

	
	@Autowired private MailSender mail;
	
	
	// MailSender mail = new MockMailSender();
	@RequestMapping("/mail")
	public String message() throws MessagingException {
		mail.send("nandini.laxmi.priya@gmail.com", "Hey", "Hii I'm sending from java application");
		return "Mail sent";
	}
}
