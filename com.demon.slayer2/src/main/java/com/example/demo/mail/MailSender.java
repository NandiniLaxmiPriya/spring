package com.example.demo.mail;

import jakarta.mail.MessagingException;

public interface MailSender {

	public void send(String to, String subject, String body)throws MessagingException;
}
