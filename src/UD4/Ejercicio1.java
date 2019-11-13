/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4;

/**
 * Clase que corresponde al ejercicio 1 y contiene los metodos para rellenar un
 * array de tamaó 5 y devolver la suma de estos.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 */
public class Ejercicio1 {

    private static int[] array = new int[5];
    private static int suma = 0;

    /**
     * Método que introduce por teclado, haciendo una llamada a la clase
     * Entrada, los elementos del array.
     */
    public static void setArray() {
//        int i =1;
//        for(int elem:array){
//            System.out.println("Introduzca el elemento " + i);
//            array[elem] = Entrada.leerEntero();
//            i++;
//        }
        System.out.println("Introduzca los datos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el elemento " + (i + 1));
            array[i] = Entrada.leerEntero();
        }
    }

    /**
     * Método que devuelve la suma de los elementos del array
     *
     * @return suma - Suma de los elementos del array.
     */
    public static String getArray() {
//        for(int elem:array){
//            suma = suma + array[elem];
//        }
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return "La suma de los elementos de array es de: " + suma;
    }

}
