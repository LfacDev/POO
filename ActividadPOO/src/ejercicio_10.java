
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros a sumar"));
        
        sumaNumeros sumaN = new sumaNumeros();
        
        sumaN.setCantNumeros(cantNum);
        
        sumaN.sumaNum();
    }
    
}
