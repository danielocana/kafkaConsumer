package com.example.spring.repository;

import com.example.spring.service.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);
}
