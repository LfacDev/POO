
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class operaciones {
    // Dado dos números ingresados por el usuario realizar las
    //4 operaciones básicas, suma, resta, multiplicación,
    //división e imprimir las operaciones. Validar la división entre 0(cero).
    
    private double num1;
    private double num2;
    
    public operaciones(){
    
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
    
    public void suma(){
        JOptionPane.showMessageDialog(null, "El resultado de la suma es :" + (this.num1+this.num2));
    }
    
    public void resta(){
        JOptionPane.showMessageDialog(null, "El resultado de la resta es :" + (this.num1-this.num2));
    }
    
    public void multiplicacion(){
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es :" + (this.num1*this.num2));
    }
    
    public void division(){
        if(this.num2 == 0){
            JOptionPane.showMessageDialog(null, "no se puede dividir un numero entre 0");
        }else{
            JOptionPane.showMessageDialog(null, "El resultado de la division es :" + (this.num1/this.num2));
        }
    }
    
}
