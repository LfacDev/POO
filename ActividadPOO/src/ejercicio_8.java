
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular el sueldo a pagar de un trabajador dado que se
        //debe ingresar la cantidad de horas trabajadas y el valor de la hora en pesos.
        
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas trabajadas"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la hora"));
        
        pagoTrabajador pTrabajador = new pagoTrabajador();
        
        pTrabajador.sethTrabajadas(horasTrabajadas);
        pTrabajador.setvHoras(valorHora);
        
        pTrabajador.sueldo();
    }
    
}
