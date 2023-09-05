
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa en Java, que realice una suma si los
        //3 números son pares, de lo contrario los reste e imprima el resultado.
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        
        sumaRestaPares sumRes = new sumaRestaPares(numero1, numero2, numero3); 
        
        sumRes.sumaResta();
    }
    
}
