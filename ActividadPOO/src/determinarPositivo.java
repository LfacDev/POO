
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class determinarPositivo {
    //Leer dos números y determinar ¿cuál de los dos es positivo?
    private double num1;
    private double num2;
    
    public determinarPositivo(){
    
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void determinar(){
        if(this.num1<0 && this.num2>0){
            JOptionPane.showMessageDialog(null, this.num2 + " Es positivo");
        }else{
            JOptionPane.showMessageDialog(null, this.num1 + " Es positivo");
        }
    }
}
