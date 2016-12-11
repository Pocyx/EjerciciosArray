/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer172Tema7 {
    /**
     * 
     * Escribe un programa que muestre por pantalla un array de 10 números enteros
        generados al azar entre 0 y 100. A continuación, el programa debe pedir
        un número al usuario. Se debe comprobar que el número introducido por
        teclado se encuentra dentro del array, en caso contrario se mostrará un
        mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
        introduzca uno correctamente. A continuación, el programa rotará el array
        hacia la derecha las veces que haga falta hasta que el número introducido
        quede situado en la posición 0 del array. Por último, se mostrará el array rotado
        por pantalla.
     * 
     * @param args the command line arguments
     */
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
            System.out.print("Introduzca un número: ");
            Scanner s = new Scanner(System.in);
            int numero = Integer.parseInt(s.nextLine());

            for(int i=0;i<aleatorios.length;i++){
                if(numero==aleatorios[i]){
                    estaDentro = true;
                    posicion = i;
                    
                }else{
                    
                }
            }
            if(!estaDentro){
                System.out.println("Vuelve a intentarlo ");
            }else {
                for(int i=0;i<aleatorios.length;i++){
                    if(i==0){
                        rotados[i]=aleatorios[posicion];
                    }else if(i!=0 && i<(10-posicion)){
                        rotados[i]=aleatorios[posicion+i];
                    }else if(i!=0 && i>=(10-posicion-1) && i<10){
                        
                        rotados[i]=aleatorios[e];
                        e++;
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
    
    
}
