package com.mob.training;

public class Saudacoes {

    public String saudacao(String stringOla, String nome) {
        stringOla = "Olá, ";

        // Caso o nome não esteja preenchido, retornar "Olá, você aí!"
        if (nome == null || nome.isEmpty()) {
            return stringOla + "você aí!";
        } 
        
        // Caso o nome esteja em maiúsculas, retornar "OLÁ, NOME!!!"
        else if (nome.equals(nome.toUpperCase())) {
            return stringOla.toUpperCase() + nome + "!!!";
        } 
        
        // Caso o nome contenha mais de uma pessoa separada por vírgula
        else if (nome.contains(",")) {
            String[] nomes = nome.split(","); // Dividir a string em nomes
            StringBuilder saudacaoFinal = new StringBuilder(stringOla);
            int tamanho = nomes.length;

            for (int i = 0; i < tamanho; i++) {
                String nomeAtual = nomes[i].trim(); // Remover espaços extras

                if (i == tamanho - 1) {
                    saudacaoFinal.append("e ").append(nomeAtual);
                } else if (i ==  tamanho - 2){
                    saudacaoFinal.append(nomeAtual).append(" ");
                }
                else {
                    saudacaoFinal.append(nomeAtual).append(", ");
                }
            }
            return saudacaoFinal.toString().trim();
        } 
        
        // Caso contrário, retornar a saudação simples
        else {
            return stringOla + nome;
        }
    }
}
