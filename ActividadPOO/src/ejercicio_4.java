
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado dos números ingresados por el usuario realizar las
        //4 operaciones básicas, suma, resta, multiplicación,
        //división e imprimir las operaciones. Validar la división entre 0(cero).
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        
        operaciones ope = new operaciones();
        
        ope.setNum1(numero1);
        ope.setNum2(numero2);
        
        ope.suma();
        ope.resta();
        ope.multiplicacion();
        ope.division();
        
        
    }
    
}
