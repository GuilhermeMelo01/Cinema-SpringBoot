package com.whiz.cinema.controller;

import com.whiz.cinema.domain.Ator;
import com.whiz.cinema.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/atores")
public class AtorController {

    @Autowired
    private AtorService atorService;

    @GetMapping
    public List<Ator> findAll(){
        return atorService.buscar();
    }

}
