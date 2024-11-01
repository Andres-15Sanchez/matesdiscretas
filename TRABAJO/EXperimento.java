/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Experimento{
    public static void main(String[] args) {
        byte A = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        byte B = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa un numero"));
        byte C = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa una numero"));
        if (A==B || A==C || C ==B){
        System.out.print("A,B,C son iguales");
    }
        if(A>B || A>C){
            System.out.print(A +" Es mayor");
        }
        if (B>A && B>C){
            System.out.print(B + " Es mayor");
        }
        if (A<C && B< C){
            System.out.print(C + " Es mayor");
        }
    }



    jbckdjbckjbcsdkjbsld
}