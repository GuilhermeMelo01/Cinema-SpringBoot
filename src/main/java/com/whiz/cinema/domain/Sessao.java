package com.whiz.cinema.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sessao implements Serializable {

    private Boolean estadoDaSessao;
    private Integer horario;

    @JsonIgnore
    @EmbeddedId
    private SessaoPK id = new SessaoPK();

    public Sessao(Filme filme, Ingresso ingresso, Boolean estadoDaSessao, Integer horario) {
        id.setFilme(filme);
        id.setIngresso(ingresso);
        this.estadoDaSessao = estadoDaSessao;
        this.horario = horario;
    }

//    @JsonIgnore
    public Filme getFilme(){
        return id.getFilme();
    }

//    @JsonIgnore
    public Ingresso getIngresso(){
        return id.getIngresso();
    }


//    public void registrarFilme(){
//
//    }
//
//    public void cadeirasDisponiveis(){
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Sessao sessao = (Sessao) o;
        return id != null && Objects.equals(id, sessao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
