package br.com.fatec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(12,calculadora.soma(10,2));
    }

    @Test
    void subtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8,calculadora.subtracao(10,2));
    }

    @Test
    void multiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20,calculadora.multiplicacao(10,2));
    }

    @Test
    void divisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5,calculadora.divisao(10,2));
    }
}