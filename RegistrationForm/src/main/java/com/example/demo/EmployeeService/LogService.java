package com.example.demo.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.LoginRequest1;
import com.example.demo.EmployeeRepository1.EmpRepository;
import com.example.demo.Entity1.Employee;

@Service
public class LogService {
	
	@Autowired
	private EmpRepository repo;
	
	

	public boolean authenticateEmp(LoginRequest1 loginrequest) {
		
		Employee emp = repo.findByEmail(loginrequest.getEmail());
	
		return emp != null && emp.getPassword().equals(loginrequest.getPassword());
	}

}
