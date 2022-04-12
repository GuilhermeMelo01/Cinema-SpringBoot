package com.whiz.cinema.service;

import com.whiz.cinema.domain.Filme;
import com.whiz.cinema.domain.Sessao;
import com.whiz.cinema.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> save(){
        return filmeRepository.findAll();
    }

}
