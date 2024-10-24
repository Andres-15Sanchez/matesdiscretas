/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class NOTAS_N {
    public static void main(String[] args) {
        char NUEVA_NOTA;
        int NOTA = 0 ;
        NOTA = (int) Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota optenida dentro del rango 1 a 20"));

        if(NOTA >= 19 && NOTA <=20){
            NUEVA_NOTA = 'A';
            System.out.println("Haz concluido");
        }else if(NOTA >=16 && NOTA <= 18){
            NUEVA_NOTA = 'B';
        }else if(NOTA >=13 && NOTA <= 15){
            NUEVA_NOTA = 'C';
        }else if(NOTA >=10 && NOTA <= 12){
            NUEVA_NOTA = 'D';
        }else if(NOTA >=16 && NOTA <= 18){
            NUEVA_NOTA = 'B';
        }else if(NOTA >=1 && NOTA <= 9){
            NUEVA_NOTA = 'E';
        }else{
            NUEVA_NOTA = 'N';
        }
        System.out.println("la nota convertida es: "+ NUEVA_NOTA);
        return;
    }
}
