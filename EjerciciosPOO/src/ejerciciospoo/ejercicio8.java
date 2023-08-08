/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

import static java.lang.Math.random;
import java.util.Random;


/**
 *
 * @author LUISA
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz[]= new int[15];
       int sumP=0;
       int sumN=0;
       int ceros=0;
       
       Random rand = new Random();
       
        for (int i = 0; i < matriz.length; i++) {
           matriz[i] = rand.nextInt(201) - 100;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);
            if(matriz[i]> 0){
              sumP++;
            }else if (matriz[i]<0) {
               sumN++;
            }else{
               ceros++; 
            } 
        }
        
        System.out.println("Cantidad de numeros positivos: " + sumP);
        System.out.println("Cantidad de numeros negativos "+ sumN);
        System.out.println("Cantidad de ceros " + ceros);
    }  
}
