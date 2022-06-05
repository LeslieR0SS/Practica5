package edu.poniperro;

public interface ICalculadora {
    public static int sumar(int numero, int numero1){
        int resultado;
        resultado=numero+numero1;
        return resultado;
    }
    public static int restar(int numero, int numero1){
        int resultado;
        resultado=numero-numero1;
        return resultado;
    }
    public static int multiplicar (int numero, int numero1){
        int resultado;
        resultado=numero*numero1;
        return resultado;
    }
    public static int dividir(int numero, int numero1){
        int resultado;
        resultado=numero/numero1;
        return resultado;
    }
}
