
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class interes {
    // Calcular el interés a pagar de un dinero colocado a
        //generar interés diario. Se debe ingresar la cantidad de
        //dinero, los días que lleva generando interés y el interés.
        //Se debe imprimir el interés y la cantidad de dinero más el interés.
    
    private double cantDinero;
    private double diasInteres;
    private double interes;

    public interes(double cantDinero, double diasInteres, double interes) {
        this.cantDinero = cantDinero;
        this.diasInteres = diasInteres;
        this.interes = interes;
    }

    public double getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(double cantDinero) {
        this.cantDinero = cantDinero;
    }

    public double getDiasInteres() {
        return diasInteres;
    }

    public void setDiasInteres(double diasInteres) {
        this.diasInteres = diasInteres;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void interesNeto(){
        JOptionPane.showMessageDialog(null, "El total interes es de: " + (this.interes/100 * this.diasInteres) * this.cantDinero);
    }
    
    public void interesTotal(){
        JOptionPane.showMessageDialog(null, "La cantidad total es de: " + ((this.interes/100 * this.diasInteres) * this.cantDinero + this.cantDinero));
    }
    
    
    
    
    
}
