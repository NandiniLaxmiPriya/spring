package com.example.demoo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demoo.model.Customer;

public interface CustomerDAO extends CrudRepository<Customer,Integer>{

}
