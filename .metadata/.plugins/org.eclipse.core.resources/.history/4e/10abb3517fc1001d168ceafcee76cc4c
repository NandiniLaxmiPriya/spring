package com.example.demo.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;

@RestController
public class MailSenderController {

	@Autowired private MailSender mailSender;
	
	@RequestMapping("/mail")
	public void sendMail() throws MessagingException {
		
		mailSender.send("nandini.laxmi.priya@gmail.com", "Test mail from Spring", "Howdy");
		
	}
	
	
}
