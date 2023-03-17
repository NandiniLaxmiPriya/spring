package com.example.demotwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("Creating table");
		jdbcTemplate.execute("DROP TABLE students IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE students("+"id SERIAL, fname VARCHAR(10), lname VARCHAR(10))");
		List<Object[]> Names = Arrays.asList("Ashu menon", "Jeff Jacob", "Jam Sush", "Jash Leo").stream()
		        .map(name -> name.split(" "))
		        .collect(Collectors.toList());
	 Names.forEach(name -> log.info(String.format("Inserting into students %s %s",name[0],name[1])));
	 jdbcTemplate.batchUpdate("INSERT INTO students(fname,lname) VALUES(?,?)",Names);
	 log.info("selecting all");
	 jdbcTemplate.query("SELECT * FROM students",(rs,rowNum)-> new Students(rs.getLong("id"),rs.getString("fname"),rs.getString("lname"))).forEach(student->log.info(student.toString()));
	}

}
