package com.capgemini.employeeonetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeeonetoone.entity.Employee;
import com.capgemini.employeeonetoone.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public Employee addEmployeeDetails()
	{
		Employee employee= service.addEmployee();
		return employee;
	}
	
	@RequestMapping("/get")
	public Employee getEmployeeDetails()
	{
		Employee employee= service.getEmployee();
		return employee;
	}
	
	
}
