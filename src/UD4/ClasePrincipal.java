/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4;

/**
 *
 * @author Usuario
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Ejercicio 1 - Rellenar array y suma de los datos\n2. Ejercicio 2-Definir tamaño array, rellenar num aleatorios e imprimirlo por pantalla.\n0 - Salir del programa.");
            n = Entrada.leerEntero();
            switch (n) {
                case 1:
                    Ejercicio1.setArray();
                    System.out.println(Ejercicio1.getArray());
                    break;
                case 2:
                    Ejercicio2.instanciaArray();
                    Ejercicio2.aleatorioArray();
                    Ejercicio2.devuelveArray();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción introducida no esta contemplada");
            }
        } while (n != 0);
    }

}
