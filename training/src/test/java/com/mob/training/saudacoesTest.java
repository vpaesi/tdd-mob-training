// training\src\test\java\com\mob\training\saudacoesTest.java
package com.mob.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class saudacoesTest {

    // 1 - Interpolar o nome com uma saudação simples.
    @Test
    void deveRetornarSaudacaoSimples() {
        Saudacoes saudacoes = new Saudacoes();
        Assertions.assertEquals("Olá, Maria", saudacoes.saudacao("Olá, ", "Maria"));
    };

    // Requisito 2 - Caso o nome não esteja preenchido, retornar "Olá, você aí".
    @Test
    void deveRetornarSaudacaoQuandoNomeNaoPreenchido() {
        Saudacoes saudacoes = new Saudacoes();
        Assertions.assertEquals("Olá, você aí!", saudacoes.saudacao("Olá, ", ""));
    };
};
// Requisito 3 - Se o nome for gritado (em maiúsculas), retornar gritando também "OLÁ, MARIA!!!".

// Requisito 4
// Para entrada com dois nomes, retornar os nomes separados com "e". Por exemplo para ["Maria, "Nina"], retornar "Olá, Maria e Nina".

// Requisito 5
// Para entrada com mais de dois nomes, separar os nomes com vírgula e o último com "e".

// Requisito 6
// Separar nomes gritados em outra saudação. Por exemplo para ["Maria", "LÚCIA", "Nina"] retornar "Olá Maria e Nina. E OLÁ, LÚCIA!!!"
// Requisito 7
// Se algum dos nomes incluir vírgula, separe e trate como nomes separados. Por exemplo para ["Maria, Lúcia", "Nina"], retornar "Olá, Maria, Lúcia e Nina".

// Requisito 8
// Permita que a entrada informe vírgulas intencionalmente usando caracteres de escape. Isso pode ser feito da mesma forma que em arquivos CSV, com aspas duplas em volta da entrada. Por exemplo para ["Maria", "\"Nina, Lúcia\""], retornar "Olá, Maria e Nina, Lúcia".
