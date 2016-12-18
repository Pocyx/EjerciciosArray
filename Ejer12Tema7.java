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
    (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
    “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
    ambos números están entre 0 y 9. El programa deberá colocar el número de
    la posición inicial en la posición final, rotando el resto de números para que no
    se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author PocyxDesigner
 */
public class Ejer12Tema7 {
    public static void main(String[] args) {
        int [] aleatorios = new int[10];
        for(int i=0;i<aleatorios.length;i++){
            aleatorios[i]=(int) (Math.random()*101);
            System.out.print(" "+aleatorios[i]+" ");
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
            System.out.printf("  %5d   ", aleatorios[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        boolean estaDentro = false;
        int posicion = 0;
        int e = 0;
        int [] rotados = new int[10];
        while(true){
            System.out.println("");
            System.out.print("Introduce posicion inicial: ");
            Scanner s = new Scanner(System.in);
            int numInicial = Integer.parseInt(s.nextLine());
            //posicion en la que se introducirá el valor inicial.
            System.out.print("Introduce posicion final: ");
            int numFinal = Integer.parseInt(s.nextLine());
            
            for(int i=0;i<aleatorios.length;i++){
                rotados[numFinal] = aleatorios[numInicial]; 
              
            }
            
            for(int i=numFinal+1;i<=aleatorios.length;i++){
                if(i<aleatorios.length){
                    rotados[i] = aleatorios[i-1];
                }
                
              
            }
            
            for(int i=0;i<aleatorios.length;i++){
                if(i==0){
                    rotados[i] = aleatorios[9];
                }else if (i==1){
                    rotados[i] = aleatorios[0];
                }else if(i<numFinal){
                    rotados[i] = aleatorios[i];
                }
              
            }

           
             // Muestra el array rotado a la derecha.  
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
                    System.out.printf("  %5d   ", rotados[i]);
                }


                System.out.print("\n└");
                for (int i = 0; i < 10; i++) {
                    System.out.print("─────┴");
                }
                System.out.print("────┘");
                
                
                break;   
                
           
        }
        
        
    }
}
