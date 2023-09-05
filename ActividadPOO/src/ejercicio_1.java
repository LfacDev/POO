
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer un número determinar si es positivo o negativo.
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        
        positivoNegativo posNeg = new positivoNegativo();
        
        posNeg.setNumero(numero);
        
        posNeg.positivoONegativo();
       
    }
    
}
