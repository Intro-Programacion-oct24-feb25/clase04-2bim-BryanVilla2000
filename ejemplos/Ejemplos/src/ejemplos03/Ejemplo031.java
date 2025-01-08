/*
 generar una solución que permita sumar dos numeros a travz de un metodo los 
numeros deben ser ingresados por teclado en el metodo main, el metodo que 
genera la uma debe verificar que los dos numeros numeros sean positivo para 
realizar la operacion caso contrario debe devolver la suma cero
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Ingrese el valor 1");
        valor1 = entrada.nextInt();

        System.out.println("Ingrese el valor 2");
        valor2 = entrada.nextInt();

        // 
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
        // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);

        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
// <>

    public static int obtenerSuma(int a, int b) {
        int suma = 0;
        if (a > 0 && b > 0) {
            suma = a + b;
        }
        return suma;
        // return a + b;
    }

}
