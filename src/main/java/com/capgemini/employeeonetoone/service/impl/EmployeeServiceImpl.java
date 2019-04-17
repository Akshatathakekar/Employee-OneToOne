package com.capgemini.employeeonetoone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeonetoone.dao.EmployeeDao;
import com.capgemini.employeeonetoone.entity.Employee;
import com.capgemini.employeeonetoone.entity.Profile;
import com.capgemini.employeeonetoone.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee addEmployee() {

		Employee employee = new Employee(101, "Akshata", new Profile(11, "Software Engineer"));
		dao.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployee() {

		Employee employee = dao.findById(101).get();

		return employee;
	}

}
