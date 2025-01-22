package com.mob.training;

public class ConversaoAlgoritmos {

    public int romanoParaArabico(String romano) {
        int resultado = 0;
        int prevValor = 0;
        for (char caractere : romano.toCharArray()) {
            int valor = getValor(caractere);
            if (valor > prevValor) {
                resultado += valor - 2 * prevValor;
            } else {
                resultado += valor;
            }
            prevValor = valor;
        }
        return resultado;
    }

    private int getValor(char romano) {
        return switch (romano) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
