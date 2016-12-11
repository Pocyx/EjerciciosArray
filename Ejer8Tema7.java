/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;
import java.util.Scanner;
/**
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
    de un determinado año y que muestre a continuación un diagrama de barras
    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
    de asteriscos o cualquier otro carácter.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer8Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] temperaturas = new int[12];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<temperaturas.length;i++){
            System.out.print("\nIntroduzca la temperatura media del mes "+(i+1)+" : ");
            int temp = Integer.parseInt(s.nextLine());
            temperaturas[i]=temp;
        }
        System.out.println("\n                       <--FRIO | CALOR-->  ");
        for(int i=0;i<temperaturas.length;i++){
            System.out.println("");
            System.out.print("Temperatura del mes "+(i+1)+" ");
            for(int j=0;j<temperaturas[i];j++){
                System.out.print("*");
            }
        }
        
    }
}
