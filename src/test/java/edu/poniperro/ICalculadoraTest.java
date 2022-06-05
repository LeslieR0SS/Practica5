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
        assertEquals("1+1", 2, ICalculadora.sumar(1,1),0);
    }
    @Test
    public void testRestar(){
        assertEquals("4-2", 2,ICalculadora.restar(4,2),1 );
    }
    @Test
    public void testMultiplicar(){
        assertEquals("4x4",16, ICalculadora.multiplicar(4, 4), 0);
    }
    @Test
    public void testDividir(){
        assertEquals("4/2",2,ICalculadora.dividir(4, 2),2);
    }
}
