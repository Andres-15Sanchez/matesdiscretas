import javax.swing.JOptionPane;
public class APOYO {
        public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, """ 
                    EL TESJI RECIBIO UN APOYO DEL GOBIERNO DE 189 MIL PESOS
                         PARA LAS ACTIVIDADES CULTURALES Y DEPORTIVAS
                    """);

            int APOYO_T = 189000;
            int PARTE_B = 9000;
            int PARTE_V = 15000;
            int PARTE_AR = 9000;
            int PARTE_F = 15000;
            int PARTE_T = 9000;
            int PARTE_AJ = 15000;
            int PARTE_M = 9000;
            int PARTE_ATL = 15000;
            double porcent1= 0.0;
            double porcent2 = 0.0;
            double porcent3 = 0.0;
            double porcent4 = 0.0;
            double porcent5 = 0.0;
            double porcent6 = 0.0;
            double porcent7 = 0.0;
            double porcent8 = 0.0;

            porcent1 = (double) ((PARTE_B * 100.0) / APOYO_T);
            porcent2 = (double) ((PARTE_V * 100.0) / APOYO_T);
            porcent3 = (double) ((PARTE_AR * 100.0) / APOYO_T);
            porcent4 = (double) ((PARTE_F * 100.0) / APOYO_T);
            porcent5 = (double) ((PARTE_T * 100.0) / APOYO_T);
            porcent6 = (double) ((PARTE_AJ * 100.0) / APOYO_T);
            porcent7 = (double) ((PARTE_M * 100.0) / APOYO_T);
            porcent8 = (double) ((PARTE_ATL * 100.0) / APOYO_T);

            JOptionPane.showMessageDialog(null, "Basquetball   $9000.00 " + porcent1 + "%"
                    + "\n" + "Voleibol   $15000.00  " + porcent2 + "%"
                    + "\n" + "Artes   $50000.00  "+ porcent3+ "%"
                    + "\n" + "Atletismo   $13000.00  " + porcent8 + "%"
                    + "\n" + "Futbol  $25000.00  " + porcent4 + "%"
                    + "\n" + "Taekoandow  $50000.00  " + porcent5 + "%"
                    + "\n" + "Ajedres   $25000.00  " + porcent6 + "%"
                    + "\n" + "Musica  $12000.00  " + porcent7 + "%"
                    + "\n" + "Atletismo   $13000.00  " + porcent8 + "%");
        }
}