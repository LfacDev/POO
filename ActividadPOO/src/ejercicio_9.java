
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular el interés a pagar de un dinero colocado a
        //generar interés diario. Se debe ingresar la cantidad de
        //dinero, los días que lleva generando interés y el interés.
        //Se debe imprimir el interés y la cantidad de dinero más el interés.
        
        double cantDinero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero"));
        double diasInteres = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los dias"));
        double interes = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el interes"));
        
        interes inte = new interes(cantDinero, diasInteres, interes);
        
        inte.interesNeto();
        inte.interesTotal();
        
        
    }
    
}
