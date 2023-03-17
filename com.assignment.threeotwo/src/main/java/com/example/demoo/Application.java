package com.example.demoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired(required=true)
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("helloo");
		 jdbcTemplate.query("SELECT * FROM EMployees",(rs,rowNum)-> new Employees(rs.getInt("id"),rs.getString("ename"),rs.getInt("phone"))).forEach(emp->log.info(emp.toString()));
	}

}
