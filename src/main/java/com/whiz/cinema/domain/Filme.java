package com.whiz.cinema.domain;

import com.whiz.cinema.enuns.EnumGeneroFilme;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer duracao;
    private EnumGeneroFilme genero;

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
