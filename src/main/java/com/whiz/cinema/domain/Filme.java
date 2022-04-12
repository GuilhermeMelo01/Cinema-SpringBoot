package com.whiz.cinema.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.whiz.cinema.enuns.EnumGeneroFilme;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer duracao;
    private EnumGeneroFilme genero;


    @OneToMany(mappedBy = "filme")
    @ToString.Exclude
    private List<Ator> atores = new ArrayList<>();

//    @ToString.Exclude
//    @OneToMany(mappedBy = "id.filme")
//    private List<Sessao> sessaos = new ArrayList<>(); //


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Filme filme = (Filme) o;
        return id != null && Objects.equals(id, filme.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
