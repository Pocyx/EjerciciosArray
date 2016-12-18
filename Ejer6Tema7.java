/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
    array. Rota los elementos de ese array, es decir, el elemento de la posición 0
    debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
    la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
    del array.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer6Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = new int[15];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<array.length;i++){
            System.out.print("Escriba un número: ");
            int n = Integer.parseInt(s.nextLine());
            array[i] = n;
        }
        
        //Muesta los números introducidos en un array
        // Muestra el array original.  
        System.out.println("\n\nArray de 15 numeros enteros rotados:");

        System.out.print("┌");
        for (int i = 0; i < 15; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 15; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 15; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Valor  ");
        for (int i = 0; i < 15; i++) {
            System.out.printf("  %5d   ", array[i]);
        }

        System.out.print("\n└");
        for (int i = 0; i < 15; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        
        
        //Rotar números.
        int aux;
        int [] rotados = new int[15];
  
        for(int i=0;i<array.length;i++){
            aux = array[i];
            int j = i+1;
            //Pasa la ultima posición del array introducido a la 
            //primera posicion del nuevo array.
            if(i==0){
                rotados[i]=array[14];
            }else if(j<15){
                rotados[j]=aux;
            } if(j==1){
                aux = array[0];
                rotados[1]=aux;
            }
 
        }
        
        
        
        // Muestra el array con los números rotados.  
        System.out.println("\n\nArray de 15 numeros enteros:");

        System.out.print("┌");
        for (int i = 0; i < 15; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 15; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 15; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Valor  ");
        for (int i = 0; i < 15; i++) {
            System.out.printf("  %5d   ", rotados[i]);
        }

        System.out.print("\n└");
        for (int i = 0; i < 15; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
    }
}
