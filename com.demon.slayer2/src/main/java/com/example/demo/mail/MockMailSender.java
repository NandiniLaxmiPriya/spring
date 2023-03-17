package com.example.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component

public class MockMailSender implements MailSender {

	private static Log log = LogFactory.getLog(MockMailSender.class);
	
	@Autowired private JavaMailSender javaMailSender;
//	public MockMailSender(JavaMailSender javaMailSender) {
//		
//		this.javaMailSender = javaMailSender;
//	}
	@Override
	public void send(String to,String subject,String body) throws MessagingException
	{
		log.info("sending mail to "+to);
		log.info("Mail subject "+subject);
		log.info("Body of mail "+body);
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		helper = new MimeMessageHelper(message,true);
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body);
		javaMailSender.send(message);
		
	}
}
