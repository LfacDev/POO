
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class sumaNumeros {
    
    private int cantNumeros;
    
    public sumaNumeros(){
    
    }

    public int getCantNumeros() {
        return cantNumeros;
    }

    public void setCantNumeros(int cantNumeros) {
        this.cantNumeros = cantNumeros;
    }
   
    public void sumaNum(){
        int suma = 0;
        for (int i = 0; i < this.cantNumeros; i++) {
            int Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero"));
            suma = suma + Numero;
        }
        JOptionPane.showMessageDialog(null, "La suma total es : " + suma);
    }
}
