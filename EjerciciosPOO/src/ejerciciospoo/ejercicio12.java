/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

import java.util.Scanner;

/**
 *
 * @author LUISA
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int posicion =11;
        
        int fib[] = new int [posicion * posicion];
        
        while( posicion > 10){
            System.out.println("Ingrese un numero menor o igual a 10");
            posicion = leer.nextInt();
        } 
        
        //empezamos llenando la primeras dos posiciones
        fib[0] = 0;
        fib[1] = 1;

        // generar los términos de la serie de fibonacci
        for (int i = 2; i < posicion * posicion; i++) {
            //aqui se hace la operacion correspondiente para llenar las demas posiciones
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // crear y llenar la matriz con los términos de la serie de fibonacci
        int[][] matriz = new int[posicion][posicion];
        int index = 0;
        for (int i = 0; i < posicion; i++) {
            for (int j = 0; j < posicion; j++) {
                //aqui recorremos las posiciones de fib y las guardamos en la matriz
                matriz[i][j] = fib[index];
                index++;
            }
        }

        // imprimir la matriz
        for (int i = 0; i < posicion; i++) {
            for (int j = 0; j < posicion;j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
