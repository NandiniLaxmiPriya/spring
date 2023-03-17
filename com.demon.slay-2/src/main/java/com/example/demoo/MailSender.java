package com.example.demoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailSender {

	@Autowired 
	private JavaMailSender javaMailSender;

	public void send(String to, String subject, String body) throws MessagingException {

//		MimeMessage message = javaMailSender.createMimeMessage();
//		MimeMessageHelper helper;
//
//		helper = new MimeMessageHelper(message, true); // true indicates
//														// multipart message
//		helper.setSubject(subject);
//		helper.setTo(to);
//		helper.setText(body, true); // true indicates html
//		// continue using helper object for more functionalities like adding
//		// attachments, etc.
		System.out.println("sending email");
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("");
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setTo(to);
		simpleMailMessage.setText(body);

		javaMailSender.send(simpleMailMessage);
		System.out.println("sent email");

	}
}
