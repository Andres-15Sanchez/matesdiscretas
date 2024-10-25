import java.util.Scanner;

public class PORCENTAJE {
    public static void main(String[] args){
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Ingresa el puntaje total, o máximo: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Ingresa el puntaje obtenido: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
       
       System.out.println("El porcentaje es = " + percentage + " %");
    }
}