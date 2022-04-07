package com.whiz.cinema.service;

import com.whiz.cinema.domain.Ator;
import com.whiz.cinema.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtorService {

    @Autowired
    private AtorRepository atorRepository;

    public List<Ator> buscar(){
        return atorRepository.findAll();
    }
}
