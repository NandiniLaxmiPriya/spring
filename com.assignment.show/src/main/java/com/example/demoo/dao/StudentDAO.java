package com.example.demoo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demoo.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer>{

}
