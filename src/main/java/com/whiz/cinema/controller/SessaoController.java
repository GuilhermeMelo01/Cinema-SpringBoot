package com.whiz.cinema.controller;

import com.whiz.cinema.domain.Sessao;
import com.whiz.cinema.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sessao")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Sessao> findAll = sessaoService.findAll();

        return ResponseEntity.ok().body(findAll);
    }
}
