package com.whiz.cinema.domain;

import com.whiz.cinema.enuns.EnumCategoriaIngresso;
import com.whiz.cinema.enuns.EnumTipoIngresso;
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
public class Ingresso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private EnumTipoIngresso tipo;
    private EnumCategoriaIngresso categoria;

    @OneToMany(mappedBy = "id.ingresso")
    @ToString.Exclude
    private List<Sessao> sessaos = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ingresso ingresso = (Ingresso) o;
        return id != null && Objects.equals(id, ingresso.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
