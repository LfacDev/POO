/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

/**
 *
 * @author LUISA
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int [15];
        int num=1;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=num;
            num++;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        
    }
    
}
