/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida 10 números por teclado y que los almacene en
    un array. A continuación se mostrará el contenido de ese array junto al índice
    (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
    primos a las primeras posiciones, desplazando el resto de números (los que
    no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
    el array resultante.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer11Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int [] primos = new int [10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<numeros.length;i++){
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            int numero = Integer.parseInt(s.nextLine());
            numeros[i]=numero;
            
        }
        
        
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%2==0){
                primos[i]=numeros[i];
            }
        }
        // Muestra el array original.  
        System.out.println("\n\nArray de 10 numeros enteros :");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %5d   ", numeros[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        
        
        ///
        //int [] ordenados = new int[20];
        int orden = 0;
        int p,a =0;
        System.out.println("");
        for(int i=0;i<numeros.length;i++){
            
            for(p=1;p<(numeros[i]+1);p++){
                if(numeros[i]%p==0){
                    a++;
                }
            }    
                if(a==2){
                    primos[orden]=numeros[i];
                        //System.out.print(" '"+numeros[i]+"' ");
                    orden++;
                }
            
        }
        
        for(int i =0;i<numeros.length;i++){
            
            for(p=1;p<(numeros[i]+1);p++){
                if(numeros[i]%p==0){
                    a++;
                   }
                }
                if(a!=2){
                    primos[orden]=numeros[i];
                        //System.out.print(" '"+numeros[i]+"' ");
                    orden++;
                }
             
        }
        
        
        
        
        
        // Muestra el array modificado.  
        System.out.println("\n\nArray ordenado por números primos :");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Primos");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %5d   ", primos[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
    }
}
