package org.example;

import java.util.HashMap;
import java.util.Map;

public class ClasseFactory {

    private static Map<String, Classe> classes = new HashMap<>();

    public static Classe getClasse(String nome, String atributoPrincipal) {
        Classe classe = classes.get(nome);
        if (classe == null) {
            classe = new Classe(nome, atributoPrincipal);
            classes.put(nome, classe);
        }
        return classe;
    }

    public static int getTotalClasses() {
        return classes.size();
    }
}
