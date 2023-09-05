
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer dos números y determinar ¿cuál de los dos es positivo?
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        
        determinarPositivo positivo = new determinarPositivo();
        
        positivo.setNum1(numero1);
        positivo.setNum2(numero2);
        
        positivo.determinar();
    }
    
}
