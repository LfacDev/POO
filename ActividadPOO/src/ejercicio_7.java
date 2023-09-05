
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular el cubo de un número entero ingresado por el usuario.
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese numero"));
        
        cubo cubo = new cubo();
        
        cubo.setNum(numero1);
        
        cubo.numCubo();
    }
    
}
