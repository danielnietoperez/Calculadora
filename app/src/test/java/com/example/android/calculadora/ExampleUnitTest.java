package com.example.android.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumar_dos_numeros() {
        double a = 4, b = 6;
        assertEquals(10,Metodos.Sumar(a,b),0);
    }
    public void restar_dos_numeros() {
        double a = 4, b = 6;
        assertEquals(-2,Metodos.Sumar(a,b),0);
    }
    public void multiplicar_dos_numeros() {
        double a = 4, b = 6;
        assertEquals(24,Metodos.Sumar(a,b),0);
    }
    public void dividir_dos_numeros() {
        double a = 5, b = 5;
        assertEquals(1,Metodos.Sumar(a,b),0);
    }
}