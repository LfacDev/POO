
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class positivoNegativo {
    // Leer un número determinar si es positivo o negativo.
    private double numero;

    public positivoNegativo() {
        
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public void positivoONegativo(){
        if (this.numero < 0) {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        }
    }
}
