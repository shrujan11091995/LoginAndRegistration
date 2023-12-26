package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
   
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.PersonEntity;
import com.example.demo.Service.PersonService;


@RestController 

public class PersonController {
	@Autowired
	private PersonService personService ;
    
	@PostMapping("/save")
     public PersonEntity addPerson(
    		 @RequestParam("sname") String sname,
             @RequestParam("age") int age) 
	{
		
		PersonEntity person = new PersonEntity(sname, age);
	
		person.setName(sname);
		person.setAge(age);
		
		return personService.addPerson(person);
		//return ("Person record inserted");
     
    }
	
	@GetMapping("/getperson")
	public List<PersonEntity> getAllPerson()
	{
		return personService.getAllPerson();
	}
     
	@GetMapping("/getsingleperson")
	public PersonEntity getSinglePerson(
			@RequestParam("Id") int  id)
	{
		return personService.getSinglePeson(id);
	}

}
