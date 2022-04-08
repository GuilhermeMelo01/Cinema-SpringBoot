package com.whiz.cinema.enuns;

public enum EnumGeneroFilme {

    ACAO(1, "Acao"),
    AVENTURA(2, "Aventura"),
    SUSPENSE(3, "Suspense"),
    COMEDIA(4, "Comedia"),
    DRAMA(5, "Drama");

    private final Integer cod;
    private final String descricao;

    EnumGeneroFilme(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public EnumGeneroFilme toEnum(Integer cod){
        if (cod == null){
            return null;
        }

        for (EnumGeneroFilme genero: EnumGeneroFilme.values()){
            if (cod.equals(genero.getCod())){
                return genero;
            }
        }

        throw new IllegalArgumentException("Genero is not valid");

    }
}
