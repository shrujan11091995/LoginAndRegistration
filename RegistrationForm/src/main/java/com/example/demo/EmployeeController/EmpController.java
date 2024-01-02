package com.example.demo.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.RequestDto;
import com.example.demo.DTO.ResponseDto;
import com.example.demo.EmployeeService.EmpService;
import com.example.demo.Entity1.Employee;

import jakarta.validation.Valid;

@RestController
/* @RequestMapping("/Employee") */
public class EmpController {

	@Autowired
	private EmpService serv;

	@PostMapping("/register")
	public ResponseEntity<ResponseDto> createEmployee(@RequestBody @Valid RequestDto request) {

		
		//calling service class --> creatingEmployee() method by passing RequestDto object(name, email,password)
		Employee employee = serv.createEmployee(request);

		ResponseDto responseDto = new ResponseDto();

		ResponseDto.Data data = new ResponseDto.Data();
		data.setEmpid(employee.getId());
		data.setEmpname(employee.getName());
		data.setEmail(employee.getEmail());
		data.setPassword(employee.getPassword());
        
		responseDto.setStatuscode(200);
		responseDto.setStatus("SUCCESS");
		responseDto.setData(data);
        
		return ResponseEntity.ok(responseDto);
	}
	
}
