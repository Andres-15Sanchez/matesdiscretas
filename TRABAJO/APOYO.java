
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andres
 */
public class APOYO {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,""" 
        EL TESJI RECIBIO UN APOYO DEL GOBIERNO DE 189 MIL PESOS
             PARA LAS ACTIVIDADES CULTURALES Y DEPORTIVAS
                                           """);
                                           
        int APOYO_T =189000;
        int PARTE_B=9000;
        int PARTE_V=15000;
        int PARTE_AR=9000;
        int PARTE_F=15000;
        int PARTE_T=9000;
        int PARTE_AJ=15000;
        int PARTE_M=9000;
        int PARTE_ATL=15000;
        double porcen=0.0;
        
            porcen =(Double)((PARTE_B*100.0)/APOYO_T);
             System.out.println("Basquetball   $9000.00 %1f");
            porcen = (Double)((PARTE_V*100.0)/APOYO_T);
             System.out.println("Voleibol   $15000.00  "+ porcen+"%");
            porcen =(Double)((PARTE_AR*100.0)/APOYO_T);
             System.out.println("Artes   $50000.00  "+ porcen+"%");
            porcen = (Double)((PARTE_F*100.0)/APOYO_T);
             System.out.println("Futbol  $25000.00  "+ porcen+"%");
            porcen =(Double)((PARTE_T*100.0)/APOYO_T);
             System.out.println("Taekoandow  $50000.00  "+ porcen+"%");
            porcen = (Double)((PARTE_AJ*100.0)/APOYO_T);
             System.out.println("Ajedres   $25000.00  "+ porcen+"%");
            porcen =(Double)((PARTE_M*100.0)/APOYO_T);
             System.out.println("Musica  $12000.00  "+ porcen+"%");
            porcen = (Double)((PARTE_ATL*100.0)/APOYO_T);
             System.out.println("Atletismo   $13000.00  "+ porcen+"%");
             
    }
}