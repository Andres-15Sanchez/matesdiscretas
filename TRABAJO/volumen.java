/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class volumen{
    public static void main(String[] args) {
        int R = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el radio"));
        int H = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
        Double VOL;
        Double AR;
        VOL = (Double) (Math.PI * (Math.pow(R , 2)* H));
        AR = (Double) (2*Math.PI * R * H);
        System.out.print("El area es: "+AR + " y el volumen es: " + VOL );
    }
}v kflvk vdlfm vlfdmvfd