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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la dimension para las matrices cuadradas: ");
        int n = leer.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] resultado = new int[n][n];

        System.out.println("Ingresa los elementos para la primera matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = leer.nextInt();
            }
        }

        System.out.println("Ingresa los elementos para la segunda matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = leer.nextInt();
            }
        }

        // Realizando la suma de las matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Primera Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("Segunda Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 System.out.print(matriz2[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 System.out.print(resultado[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
