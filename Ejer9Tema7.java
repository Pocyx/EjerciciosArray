/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
    números junto con la palabra “par” o “impar” según proceda.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer9Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] parimpares = new int[8];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<parimpares.length;i++){
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            int numero = Integer.parseInt(s.nextLine());
            parimpares[i]=numero;
        }
        int [] pares = new int [8];
        int [] impares = new int [8];
        for(int i=0;i<parimpares.length;i++){
            if(parimpares[i]%2==0){
                pares[i]=parimpares[i];
            }else{
                impares[i]=parimpares[i];
            }
        }
        // Muestra el array original.  
        System.out.println("\n\nArray de 8 numeros enteros rotados:");

        System.out.print("┌");
        for (int i = 0; i < 8; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 8; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 8; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 8; i++) {
            System.out.printf("  %5d   ", parimpares[i]);
        }
        
        //
        System.out.print("\n├");
        for (int i = 0; i < 8; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Pares  ");
        for (int i = 0; i < 8; i++) {
            System.out.printf("  %5d   ", pares[i]);
        }
        //
        //
        System.out.print("\n├");
        for (int i = 0; i < 8; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Imares ");
        for (int i = 0; i < 8; i++) {
            System.out.printf("  %5d   ", impares[i]);
        }
        //

        System.out.print("\n└");
        for (int i = 0; i < 8; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
    }
}
