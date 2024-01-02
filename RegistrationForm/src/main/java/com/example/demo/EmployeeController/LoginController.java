package com.example.demo.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.LoginRequest1;
import com.example.demo.EmployeeService.LogService;

@RestController
public class LoginController {
	
	@Autowired
	private LogService logservice;
	
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest1 loginrequest){
		
		if(logservice.authenticateEmp(loginrequest))
				{
			
			return ResponseEntity.ok("Login successful");
			
		}else {
			
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");		
		
		}		
	}
}
