package com.whiz.cinema.service;

import com.whiz.cinema.domain.Sessao;
import com.whiz.cinema.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;

    public List<Sessao> findAll(){
        return sessaoRepository.findAll();
    }
}
