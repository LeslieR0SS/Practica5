package edu.poniperro;

public interface ICalculadora {
    public static int sumar(int numero, int numero1){
        return numero + numero1;
    }
    public static int restar(int numero, int numero1){
        return numero - numero1;
    }
    public static int multiplicar (int numero, int numero1){
        return numero * numero1;
    }
    public static int dividir(int numero, int numero1){
        return numero / numero1;
    }
}
