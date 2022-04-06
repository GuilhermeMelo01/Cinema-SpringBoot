package com.whiz.cinema.controller;

import com.whiz.cinema.domain.Person;
import com.whiz.cinema.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController{

    @Autowired
    private PersonService personService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Person>> listAll(){
        return ResponseEntity.ok(personService.listAll());
    }

}
