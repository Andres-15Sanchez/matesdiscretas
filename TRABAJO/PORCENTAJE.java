/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class Descuento {
    public static void main(String[] args) {
        int cost = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el total de su compra"));
        int D = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero del 1 al 4"));
        double T_PAGAR;
        if(D == 1){
            JOptionPane.showMessageDialog(null,"Felicidades sacaste la pelota roja");
            JOptionPane.showMessageDialog(null,"Tienes un descuento del 40%");
            T_PAGAR = (double)(cost*0.40);
            JOptionPane.showMessageDialog(null,"tu monto a pagar "+ T_PAGAR);
        }
        else if(D==2){
            JOptionPane.showMessageDialog(null,"Felicidades sacaste la pelota verde");
            JOptionPane.showMessageDialog(null,"Tienes un descuento del 28%");
            T_PAGAR = (double)(cost*0.28);
            JOptionPane.showMessageDialog(null,"tu monto a pagar "+ T_PAGAR);
        }
        else if(D==3){
            JOptionPane.showMessageDialog(null,"Felicidades sacaste la pelota azul");
            JOptionPane.showMessageDialog(null,"Tienes un descuento del 15%");
            T_PAGAR = (double)(cost*0.15);
            JOptionPane.showMessageDialog(null,"tu monto a pagar "+ T_PAGAR);
        }
        else if(D==4){
            JOptionPane.showMessageDialog(null,"Felicidades sacaste la pelota verde");
            JOptionPane.showMessageDialog(null,"Tienes un descuento del 5%");
            T_PAGAR = (double)(cost*0.5);
            JOptionPane.showMessageDialog(null,"tu monto a pagar "+ T_PAGAR);
        }
    }
    
}clskdp ehsppihwlkbvldkblsdkbeslkfsldk