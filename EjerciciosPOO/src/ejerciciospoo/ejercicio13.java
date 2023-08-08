/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

/**
 *
 * @author LUISA
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int [4][4];
        
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println();
        }
    }
    
}
