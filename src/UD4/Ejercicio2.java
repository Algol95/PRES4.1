/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4;

/**
 * Clase que contiene métodos para instanciar una array, rellenarla de números
 * aleatorios y devolverlos.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 1.0
 */
public class Ejercicio2 {

    private static int[] array;
    private static int n;

    /**
     * Método que instancia un array de tamaño a elección del usuario.
     */
    public static void instanciaArray() {

        System.out.println("Defina el tamaño del array");
        n = Entrada.leerEntero();
        array = new int[n];

    }

    /**
     * Método que rellena el array con números aleatorios.
     */
    public static void aleatorioArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
    }

    /**
     * Método que imprime los datos de array, con su posición e indicando si el
     * dato es par o impar.
     */
    public static void devuelveArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Posición " + (i + 1) + ": " + array[i]);
            if (array[i] % 2 == 0) {
                System.out.println(" || Par");
            } else {
                System.out.println(" || Impar");
            }
        }
    }
}
