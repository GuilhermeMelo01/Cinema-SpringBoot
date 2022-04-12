package com.whiz.cinema.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class SessaoPK implements Serializable {

    @ManyToOne
    @JoinColumn(name="id_filme")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name="id_ingresso")
    private Ingresso ingresso;



}
