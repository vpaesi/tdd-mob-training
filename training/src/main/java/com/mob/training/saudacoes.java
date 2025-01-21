// training\src\main\java\com\mob\training\Saudacoes.java
package com.mob.training;

public class Saudacoes {

    public String saudacao(String ola, String nome) {
        ola = "Olá, ";
        // Caso o nome não esteja preenchido, retornar "Olá, você aí!"
        if (nome == null || nome.isEmpty()) {
            return ola + "você aí!";
        } // Caso o nome esteja em maiúsculas, retornar "OLÁ, NOME!"
        else if (nome.equals(nome.toUpperCase())) {
            return ola.toUpperCase() + nome + "!";
        } // Caso contrário, retornar a saudação simples
        else if (nome.equals(nome)) {
            return ola + nome;
        } else {
            throw new UnsupportedOperationException("Ainda não implementado");
        }
    }
};
