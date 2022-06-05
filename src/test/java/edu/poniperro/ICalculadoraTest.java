package edu.poniperro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ICalculadoraTest {
    ICalculadora calc = null;
    @Before
    public void iniciar(){
        calc = new Calculadora();
    }
    @Test
    public void testSumar(){
        assertEquals("1+1", 2, calc.sumar(1,1),.001);
    }
    @Test
    public void testRestar(){
        assertEquals("4-2", 2, calc.restar(4,2),.001);
    }
    @Test
    public void testMultiplicar(){
        assertEquals("4x4",16, calc.multiplicar(4, 4), .001);
    }
    @Test
    public void testDividir(){
        assertEquals("4/2",2, calc.dividir(4, 2),.001);
    }
}
