package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServidorTest {

    @Test
    void deveRetornarJogadores() {
        Servidor servidor = new Servidor();
        servidor.cadastrar("Joao", "Mago", "Intelecto");
        servidor.cadastrar("Maria", "Mago", "Intelecto");
        servidor.cadastrar("Rita", "Mago", "Intelecto");
        servidor.cadastrar("Rodolfo", "Guerreiro", "Força");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Joao', classe='Mago', atributo principal='Intelecto'}",
                "Jogador{nome='Maria', classe='Mago', atributo principal='Intelecto'}",
                "Jogador{nome='Rita', classe='Mago', atributo principal='Intelecto'}",
                "Jogador{nome='Rodolfo', classe='Guerreiro', atributo principal='Força'}");

        assertEquals(saida, servidor.obterJogadores());
    }

    @Test
    void deveRetornarTotalClasses() {
        Servidor servidor = new Servidor();
        servidor.cadastrar("Joao", "Mago", "Intelecto");
        servidor.cadastrar("Maria", "Mago", "Intelecto");
        servidor.cadastrar("Rita", "Mago", "Intelecto");
        servidor.cadastrar("Rodolfo", "Guerreiro", "Força");

        assertEquals(2, ClasseFactory.getTotalClasses());
    }

}