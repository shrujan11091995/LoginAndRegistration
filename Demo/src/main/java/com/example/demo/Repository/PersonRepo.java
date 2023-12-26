package com.example.demo.Repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.PersonEntity;

public interface PersonRepo extends CrudRepository<PersonEntity, Integer> {

}
