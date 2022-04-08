package com.whiz.cinema.controller;

import com.whiz.cinema.domain.Filme;
import com.whiz.cinema.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/filmes")
@RestController
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping(value = "/all")
    public List<Filme> findAll(){
        return filmeService.buscar();
    }

}
