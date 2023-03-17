package com.example.demoo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Ticket {
	@Id
	@GeneratedValue
	private int id;
	private String ename;
	private int phone;
}
