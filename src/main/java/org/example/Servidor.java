package org.example;

import java.util.ArrayList;
import java.util.List;

public class Servidor {

    private List<Jogador> jogadores = new ArrayList<>();

    public void cadastrar(String nomeJogador, String nomeClasse, String atributoPrincipal) {
        Classe classe = ClasseFactory.getClasse(nomeClasse, atributoPrincipal);
        Jogador jogador = new Jogador(nomeJogador, classe);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }
}
