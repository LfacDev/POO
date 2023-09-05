
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class pagoTrabajador {
    
    private double hTrabajadas;
    private double vHoras;
    
    public pagoTrabajador(){
    
    }

    public double gethTrabajadas() {
        return hTrabajadas;
    }

    public void sethTrabajadas(double hTrabajadas) {
        this.hTrabajadas = hTrabajadas;
    }

    public double getvHoras() {
        return vHoras;
    }

    public void setvHoras(double vHoras) {
        this.vHoras = vHoras;
    }
    
    public void sueldo(){
        JOptionPane.showMessageDialog(null, "El sueldo del trabajador es :" + (this.hTrabajadas*this.vHoras) + " pesos");
    }
}
