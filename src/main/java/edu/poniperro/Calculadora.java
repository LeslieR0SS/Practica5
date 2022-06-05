package edu.poniperro;

public class Calculadora implements ICalculadora{
    /**
     *
     * Clase principal Calculadora implementando la interfaz
     *
     */

     /**
      * obtenemos los dos numeros y realizamos la suma
      * @param numero1
      * @param numero2
      * @return int
      */
     @Override
     public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
     /**
      * obtenemos los dos numeros y realizamos la resta
      *
      * @param numero1
      * @param numero2
      * @return double
     */
     @Override
     public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    /**
     * obtenemos los dos numeros y realizamos la multiplicacion
     * @param numero1
     * @param numero2
     * @return int
     */

    @Override
    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;

    }
    /**
     * obtenemos los dos numeros y realizamos la division
     *
     * @param numero1
     * @param numero2
     * @return int
     */

    @Override
    public int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }
}
