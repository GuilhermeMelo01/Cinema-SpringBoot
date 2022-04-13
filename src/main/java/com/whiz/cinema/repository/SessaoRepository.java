package com.whiz.cinema.repository;

import com.whiz.cinema.domain.Sessao;
import com.whiz.cinema.domain.SessaoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, SessaoPK> {
}
