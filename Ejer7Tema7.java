/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
    muestre por pantalla separados por espacios. El programa pedirá entonces
    por teclado dos valores y a continuación cambiará todas las ocurrencias del
    primer valor por el segundo en la lista generada anteriormente. Los números
    que se han cambiado deben aparecer entrecomillados.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer7Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] aleatorios = new int[100];
        for(int i=0;i<aleatorios.length;i++){
            aleatorios[i]=(int) (Math.random()*21);
            System.out.print(" "+aleatorios[i]+" ");
        }
        Scanner s = new Scanner(System.in);
        System.out.print("\nIntroduzca un valor que aparezca en la lista para reemplazarlo: ");
        int valor1 = Integer.parseInt(s.nextLine());
        System.out.print("\nIntroduzca el nuevo número: ");
        int valor2 = Integer.parseInt(s.nextLine());
        for(int i=0;i<aleatorios.length;i++){
            if(aleatorios[i]==valor1){
                aleatorios[i]=valor2;
                System.out.print(" '"+aleatorios[i]+"' ");
            }else{
                System.out.print(" "+aleatorios[i]+" ");
            }
            
        }
        
    }
}
