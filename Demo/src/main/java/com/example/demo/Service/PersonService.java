package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.PersonEntity;
import com.example.demo.Repository.PersonRepo;

@Service
public class PersonService {
	
	@Autowired 
	
	private PersonRepo personrepo;
	
	

	public PersonEntity addPerson(PersonEntity person) {

        return personrepo.save(person);
		
	}

	public List<PersonEntity> getAllPerson() {
		return (List<PersonEntity>) personrepo.findAll();
	}

	public PersonEntity getSinglePeson(int id) {
	    return  personrepo.findById(id).get();
	}

	


}



