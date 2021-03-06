package com.whiz.cinema.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
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

//    @JsonIgnore
    @JoinColumn(name = "filme_id")
    @ManyToOne
    @ToString.Exclude
    private Filme filme;

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
