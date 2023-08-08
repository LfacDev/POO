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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la dimension para las matrices cuadradas: ");
        int n = leer.nextInt();
        int matriz[][] = new int [n][n];
        int num = 2;
        int max = matriz[0][0];
        int min = 2;
        
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               matriz[i][j]=num;
               num+=2;
            }
        }
        
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               
               if(matriz[i][j]> max){
                   max=matriz[i][j];
               }
               if(matriz[i][j]<min){
                   min=matriz[i][j];
               }
            }
        }
        System.out.println(" ");
        
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
        
    }
    
}
