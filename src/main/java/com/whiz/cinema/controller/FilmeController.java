package com.whiz.cinema.controller;

import com.whiz.cinema.domain.Filme;
import com.whiz.cinema.domain.Sessao;
import com.whiz.cinema.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("filme")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Filme> save = service.save();
        return ResponseEntity.ok().body(save);
    }

}
