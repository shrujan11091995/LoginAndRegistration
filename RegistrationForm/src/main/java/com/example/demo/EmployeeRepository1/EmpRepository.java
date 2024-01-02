package com.example.demo.EmployeeRepository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity1.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	

	Employee findByEmail(String emailAddress);

}
