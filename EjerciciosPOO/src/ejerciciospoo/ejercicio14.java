/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LUISA
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int posicion;
        int posicion2;
        
        do{
            System.out.println("Ingrese posicion 1");
            posicion = leer.nextInt();
            System.out.println("Ingrese posicion 2");
            posicion2 = leer.nextInt();
        }while(posicion <= 0 && posicion2 <= 0);
        
        int matriz[][]= new int[posicion][posicion2];
        
        Random rand = new Random();
       
        for (int i = 0; i < posicion; i++) {
            for (int j = 0; j < posicion2; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        
        for (int i = 0; i < posicion; i++) {
            for (int j = 0; j < posicion2; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
