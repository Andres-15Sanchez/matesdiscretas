/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class AREA_VOLUMEN{
    public static void main(String[] args) {
        final byte BA=2 ;
        final int P= (int) 3.14;
        int R = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el radio"));
        int H = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
        int v;
        int a;
        v = (int) (((P)*(R*R))*H);
        a = (int) ((BA)(P)(R)*(H + R));
        JOptionPane.showMessageDialog(null,"El volumen es "+ v);
        JOptionPane.showMessageDialog(null,"y su area es "+ a);
    }
}

