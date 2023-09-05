
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class sumaRestaPares {
    // Realizar un programa en Java, que realice una suma si los
    //3 números son pares, de lo contrario los reste e imprima el resultado.
    
    private double num1;
    private double num2;
    private double num3;

    public sumaRestaPares(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
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

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }
    
    public void sumaResta(){
        if(this.num1 %2 == 0 && this.num2 %2 == 0 && this.num3 %2 == 0 ){
            JOptionPane.showMessageDialog(null, "El resultado de la suma es :" + (this.num1+this.num2+this.num3));
        }else {
            JOptionPane.showMessageDialog(null, "El resultado de la resta es :" + (this.num1-this.num2-this.num3));
        }
    }
}
