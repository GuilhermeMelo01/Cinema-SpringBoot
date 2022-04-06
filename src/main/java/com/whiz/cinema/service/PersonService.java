package com.whiz.cinema.service;

import com.whiz.cinema.domain.Person;
import com.whiz.cinema.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> listAll(){
        return personRepository.findAll();
    }
}
