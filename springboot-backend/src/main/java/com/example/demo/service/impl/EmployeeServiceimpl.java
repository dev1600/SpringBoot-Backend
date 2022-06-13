package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRespository;
import com.example.demo.service.EmployeeService;


@Service
public class EmployeeServiceimpl implements EmployeeService {
	private EmployeeRespository employeeRepository;
	
	public EmployeeServiceimpl(EmployeeRespository employeeRepository) {
		// TODO Auto-generated method stub
		super();
		this.employeeRepository=employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
}
