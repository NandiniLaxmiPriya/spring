package com.example.demoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoo.dao.CustomerDAO;
//import com.example.demoo.dao.StudentDAO;
import com.example.demoo.model.Customer;

@RestController
@RequestMapping(path="/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping(path="/show")
	public @ResponseBody Iterable<Customer> getAll()
	{
		return customerDAO.findAll();
	}
	
	@PostMapping(path="/add")
	public @ResponseBody String addAll(@RequestParam String cname, @RequestParam int age,@RequestParam int orderno)
	{
		Customer c = new Customer();
		c.setCname(cname);
		c.setAge(age);
		c.setOrderno(orderno);
		customerDAO.save(c);
		return "saved";
	}
}
