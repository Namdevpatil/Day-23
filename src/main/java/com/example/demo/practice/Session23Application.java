package com.example.demo.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Session23Application implements CommandLineRunner
{

	
	
	public static void main(String[] args) {
		SpringApplication.run(Session23Application.class, args);
		
	}
	
	@Bean
	public HelloText getHelloText()
	{
		return new HelloTextImplementation();
	}
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = getEmployee();
		employee.setEmployeeId(201);
		employee.setEmployeeName("Gyaneshwar");
		
		//System.out.println(getHelloText().text());
		System.out.println(employee.toString());
		
	}

}
