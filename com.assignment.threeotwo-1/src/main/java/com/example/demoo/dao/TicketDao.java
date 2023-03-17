package com.example.demoo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demoo.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket,Integer> {

}
