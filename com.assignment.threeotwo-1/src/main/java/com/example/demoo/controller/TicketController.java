package com.example.demoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoo.dao.TicketDao;
import com.example.demoo.model.Ticket;

@RestController

public class TicketController {

	@Autowired
	private TicketDao dao;
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets()
	{
		return (List<Ticket>) dao.findAll();
	}
}
