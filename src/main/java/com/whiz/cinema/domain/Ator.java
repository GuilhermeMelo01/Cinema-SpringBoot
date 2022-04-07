package com.whiz.cinema.domain;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String papelDoAtor;

    @ManyToMany(mappedBy = "atores")
    @ToString.Exclude
    private List<Filme> filmes = new ArrayList<>();

    public Ator(Long id, String nome, String papelDoAtor) {
        this.id = id;
        this.nome = nome;
        this.papelDoAtor = papelDoAtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ator ator = (Ator) o;
        return id != null && Objects.equals(id, ator.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
