package org.example;

public class Jogador {

    private String nome;
    private Classe classe;

    public Jogador(String nome, Classe classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", classe='" + classe.getNome() + '\'' +
                ", atributo principal='" + classe.getAtributoPrincipal() + '\'' +
                '}';
    }
}
