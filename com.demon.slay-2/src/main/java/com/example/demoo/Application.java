package com.example.demoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class Application {

	@Autowired 
	private MailSender mailSender;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerstart() throws MessagingException
	{
		mailSender.send("nandini.laxmi.priya@gmail.com","Hey","Hiiiiii");
	}
}