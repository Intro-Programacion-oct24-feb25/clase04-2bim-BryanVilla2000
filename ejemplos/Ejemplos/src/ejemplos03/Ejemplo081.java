/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        int limite;
        int tabla;
        int opcion;
        String mensajeSuma="";
        String mensajeSumaDos="";
        
        System.out.println("Ingrese el valor de la tabla");
        tabla=entrada.nextInt();
        
        System.out.println("Ingrese el limite de la tabla");
        limite= entrada.nextInt();
        
        System.out.println("Menu\n1. Tabla suma\n2.Tabla multiplicacion");
        opcion= entrada.nextInt();
        switch (opcion) {
            case 1:
                mensajeSuma = obtenerTablaSumar(limite, tabla);
                break;
            case 2:
             mensajeSumaDos = obtenerTablaMultiplicar(limite,tabla );
             break;
        }
        
        
        //mensajeSuma = obtenerTablaSumar(10, 9); // se invoca al método 
                                                       // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
        
        //mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
