package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@Configuration
@RestController
public class EmployeeController {

	@Bean
	public Employee getEmployee()
	{
		return new Employee();
	}
	
	@GetMapping("/employee")
	public String getEmployeeDetails()
	{
		Employee employee = getEmployee();
		employee.setEmployeeId(201);
		employee.setEmployeeName("Gyaneshwar");
		
		return employee.toString();
	}
	
}
