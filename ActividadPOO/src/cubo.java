
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUISA
 */
public class cubo {
    
    private double num;
    
    public cubo(){
    
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
    
    public void numCubo(){
        JOptionPane.showMessageDialog(null, "El numero " + this.num + " elevado al cubo es : " + (Math.pow(3, this.num)));
    }
}
