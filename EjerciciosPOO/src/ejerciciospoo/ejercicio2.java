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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int sum = 0;
        int sum2=0;
        
        //calcula la suma de los dígitos de un número. 
        //Lo hace extrayendo el último dígito del número (usando num % 10)
        //sumándolo a la suma total, y luego quitando ese dígito del número (usando num / 10). 
        //Este proceso se repite hasta que no quedan dígitos en el número (es decir, hasta que num es 0). 
        while (num > 0) {
             sum += num % 10;
             num /= 10;
        }
        
        if(sum>10){
            while (sum > 0) {
             sum2 += sum % 10;
             sum /= 10;
            }
            System.out.println("La raiz digital es: " + sum2);
        }else{
            System.out.println("La raiz digital es: " + sum);
        }
   
    }
}
