package com.example.demo.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
