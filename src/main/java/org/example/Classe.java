package org.example;

public class Classe {

    private String nome;
    private String atributoPrincipal;

    public Classe(String nome, String atributoPrincipal) {
        this.nome = nome;
        this.atributoPrincipal = atributoPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public String getAtributoPrincipal() {
        return atributoPrincipal;
    }
}
