package com.mob.training.ex1;

import org.junit.jupiter.api.Test;

import com.mob.training.saudacoes;

public class saudacoesTest {
    // Uma função pura é aquela para qual o resultado é sempre o mesmo dada a mesma entrada e não tem efeitos colaterais; ou seja não utiliza informações que não receba por parâmetro, como variáveis globais, e não altera nenhum dado, inclusive os parâmetros

    @Test
    void deveRetornarSaudacaoPura() {
        // Dado que eu tenho um objeto saudacoes
        saudacoes saudacoes = new saudacoes();

        // Quando eu chamo a função saudacoes.saudacaoPura
        String resultado = saudacoes.saudacaoPura("Mundo");

        // Então o resultado deve ser "Olá, Mundo!"
        assert resultado.equals("Olá, Mundo!");

    }
}
