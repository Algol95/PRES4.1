package UD4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase que contiene metodos de entrada y salida de datos.
 * @author Ángel Miguel Cubino Aragón
 * @version 1.1
 */
public class Entrada {

    private static Scanner teclado = new Scanner(System.in);

    /**
     * Método que sirve para introducir por teclado un entero de tipo int.
     *
     * @return Devuelve un entero de tipo int.
     */
    public static int leerEntero() {
        boolean error = true;
        int num = 0;
        do {
            try {
                System.out.println("Introduzca un entero: ");
                num = teclado.nextInt();
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un entero");
                teclado.next();
            }

        } while (error == true);
        return num;
    }

    /**
     * Método que sirve para introducir por teclado un entero de tipo long.
     *
     * @return Devuelve un entero de tipo long.
     */
    public static long leerEnteroLargo() {
        boolean error = true;
        long num = 0L;
        do {
            try {
                num = teclado.nextLong();
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un entero");
                teclado.next();
            }

        } while (error == true);
        return num;
    }

    /**
     * Método que sirve para introducir por teclado un número real de tipo
     * float.
     *
     * @return Devuelve un real de tipo float.
     */
    public static float leerReal() {
        boolean error = true;
        float num = 0F;
        do {
            try {
                num = teclado.nextFloat();
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un número real");
                teclado.next();
            }

        } while (error == true);
        return num;
    }
    
    /**
     * Método que sirve para introducir por teclado un entero de tipo long.
     * @return Devuelve un entero de tipo long.
     */
    public static double leerRealLargo() {
        boolean error = true;
        double num=0;
        do {
            try {
                num = teclado.nextDouble();
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un real");
                teclado.next();
            }
            
        } while (error == true);
        return num;
    }
    
    /**
     * Método que sirve para introducir por teclado una cadena tipo String.
     * @return Devuelve un texto de tipo String.
     */
    public static String leerCadena() {
        boolean error = true;
        String cadena="";
        do {
            try {
                cadena = teclado.next();
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un texto.");
                teclado.next();
            }
            
        } while (error == true);
        return cadena;
    }
    
    /**
     * Método que sirve para introducir por teclado un caracter de tipo char.
     * @return Devuelve un caracter de tipo char.
     */
    public static char leerCaracter() {
        boolean error = true;
        char caracter=' ';
        do {
            try {
                caracter = teclado.next().charAt(0);
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un caracter");
                teclado.next();
            }
            
        } while (error == true);
        return caracter;
    }
    
    /**
     * Método que sirve para introducir por teclado un booleano.
     * @return Devuelve un booleano.
     */
    public static boolean leerBooleano() {
        boolean error = true;
        boolean bool=false;
        do {
            try {
                bool = teclado.nextBoolean();
                error = false;
            } catch (Exception e) {
                System.out.println("Debe introducir un true o false");
                teclado.next();
            }
            
        } while (error == true);
        return bool;
    }
}
