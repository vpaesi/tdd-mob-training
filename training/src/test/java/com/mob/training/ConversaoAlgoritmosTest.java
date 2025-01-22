package com.mob.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConversaoAlgoritmosTest {

    @Test
    public void testDeveRetornarNumeroRomanos() {
        ConversaoAlgoritmos conversao = new ConversaoAlgoritmos();
        assertEquals(1, conversao.romanoParaArabico("I"));
        assertEquals(5, conversao.romanoParaArabico("V"));
        assertEquals(10, conversao.romanoParaArabico("X"));
        assertEquals(50, conversao.romanoParaArabico("L"));
        assertEquals(100, conversao.romanoParaArabico("C"));
        assertEquals(500, conversao.romanoParaArabico("D"));
        assertEquals(1000, conversao.romanoParaArabico("M"));
    }

    @Test
    public void deveRetornarNumerosRomanosSomados() {
        ConversaoAlgoritmos conversao = new ConversaoAlgoritmos();
        assertEquals(2, conversao.romanoParaArabico("II"));
        assertEquals(4, conversao.romanoParaArabico("IV"));
        assertEquals(9, conversao.romanoParaArabico("IX"));
        assertEquals(40, conversao.romanoParaArabico("XL"));
        assertEquals(90, conversao.romanoParaArabico("XC"));
        assertEquals(400, conversao.romanoParaArabico("CD"));
        assertEquals(900, conversao.romanoParaArabico("CM"));
    }

    @Test
    public void testDeveRetornarNumeroRomanosComplexos() {
        ConversaoAlgoritmos conversao = new ConversaoAlgoritmos();
        assertEquals(2006, conversao.romanoParaArabico("MMVI"));
        assertEquals(1944, conversao.romanoParaArabico("MCMXLIV"));
    }
}
