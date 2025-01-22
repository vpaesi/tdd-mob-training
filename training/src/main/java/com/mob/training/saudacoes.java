package com.mob.training;

import java.util.ArrayList;
import java.util.List;

public class Saudacoes {

    public String saudacao(String stringOla, String nome) {
        stringOla = "Olá, ";

        // Caso o nome não esteja preenchido, retornar "Olá, você aí!"
        if (nome == null || nome.isEmpty()) {
            return stringOla + "você aí!";
        }

        // Caso o nome esteja em maiúsculas, retornar "OLÁ, NOME!!!"
        if (nome.equals(nome.toUpperCase())) {
            return stringOla.toUpperCase() + nome + "!!!";
        }

        List<String> nomes = new ArrayList<>();
        boolean dentroDeAspas = false;
        StringBuilder nomeAtual = new StringBuilder();

        // Tratamento de caracteres para aspas
        for (char caractereDoNome : nome.toCharArray()) {
            if (caractereDoNome == '"') {
                dentroDeAspas = !dentroDeAspas;
            } else if (caractereDoNome == ',' && !dentroDeAspas) {
                nomes.add(nomeAtual.toString().trim());
                nomeAtual.setLength(0);
            } else {
                nomeAtual.append(caractereDoNome);
            }
        }
        if (nomeAtual.length() > 0) {
            nomes.add(nomeAtual.toString().trim());
        }

        StringBuilder saudacaoNormal = new StringBuilder(stringOla);
        StringBuilder saudacaoGritada = new StringBuilder("E OLÁ, ");
        boolean temNomeGritado = false;

        // Tratamento de nomes normais e gritados
        for (int i = 0; i < nomes.size(); i++) {
            String nomeProcessado = nomes.get(i).trim();

            if (nomeProcessado.equals(nomeProcessado.toUpperCase())) {
                if (temNomeGritado) {
                    saudacaoGritada.append(", ");
                }
                saudacaoGritada.append(nomeProcessado).append("!!!");
                temNomeGritado = true;
            } else {
                if (saudacaoNormal.length() > stringOla.length()) {
                    saudacaoNormal.append(i == nomes.size() - 1 ? " e " : ", ");
                }
                saudacaoNormal.append(nomeProcessado.replace("\"", ""));
            }
        }

        if (temNomeGritado) {
            return saudacaoNormal.toString().trim() + ". " + saudacaoGritada.toString();
        } else {
            return saudacaoNormal.toString().trim();
        }
    }
}
