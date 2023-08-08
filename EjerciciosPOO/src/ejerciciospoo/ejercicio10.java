/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

import java.util.Random;

/**
 *
 * @author LUISA
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz[]= new int[20];
       int numPar=0;
       int numImpar=0;
   
       
       Random rand = new Random();
       
        for (int i = 0; i < matriz.length; i++) {
           matriz[i] = rand.nextInt(201);
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);
            if(matriz[i] % 2 == 0){
              numPar++;
            }else{
               numImpar++; 
            } 
        }
        
        System.out.println("Cantidad de numeros pares: " + numPar);
        System.out.println("Cantidad de numeros impares "+ numImpar);
    }
    
}
