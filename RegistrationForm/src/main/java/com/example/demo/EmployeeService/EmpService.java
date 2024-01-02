package com.example.demo.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.RequestDto;
import com.example.demo.EmployeeRepository1.EmpRepository;
import com.example.demo.Entity1.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpRepository repo;

	public Employee createEmployee(RequestDto request) {
		  
		 Employee emp = new Employee();
		 
		 emp.setName(request.getName());
		 emp.setEmail(request.getEmail());
		 emp.setPassword(request.getPassword());
		 
		 Employee employee =repo.save(emp);
		 
		return employee;
	}
	
}
