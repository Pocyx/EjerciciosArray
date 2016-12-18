/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.*;
import java.lang.*;


import java.util.Scanner;

/**
 *
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
    continuación, las palabras correspondientes a colores se deben almacenar al
    comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
    auxiliares como quieras. Los colores que conoce el programa deben estar en
    otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
    blanco y morado.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer14Tema7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean color = false;
        String [] palabras = new String[8];
        String [] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};     
        String [] rotados = new String[8];
        String palabra;
        for(int i=0;i<palabras.length;i++){
            System.out.println("Introduzca palabra: ");
            palabra = s.nextLine();
            palabras[i] = palabra;
            /**
            for(int e=0;e<colores.length;e++){
                if(colores[i].equals(palabra)){
                    rotados[orden]=palabras[i];
                    orden++;
                }
            }**/
            /**
            if(color){
                for(int u=0;u<palabras.length;u++){
                    if(i==0){
                        rotados[u]=palabras[posicion];
                    }else if(u!=0 && u<(10-posicion)){
                        rotados[u]=palabras[posicion+u];
                    }else if(u!=0 && u>=(10-posicion-1) && u<10){
                        
                        rotados[i]=palabras[j];
                        j++;
                    }
                    
                }
            }*/
        }
        int orden = 0;
        for(int i=0;i<palabras.length;i++){
            for(int e=0;e<colores.length;e++){
                if(colores[e].equals(palabras[i])){
                    rotados[orden]=palabras[i];
                    orden++;
                }
            }
            
        }
        
        
        for(int i=0;i<palabras.length;i++){
            boolean esColor = false;
            for(int e=0;e<colores.length;e++){
                if(colores[e].equals(palabras[i])){
                    esColor = true;

                }
                
                
            }
            if (!esColor) {
                rotados[orden++]=palabras[i];
            }
            
            
            
        }
        
        
        // Muestra el array rotado a la derecha.  
        System.out.println("\n\nOrdenado por colores :");
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
        System.out.print("\n│ Colores");
        for (int i = 0; i < 8; i++) {
            System.out.printf(" %8s ", rotados[i]);
        }


        System.out.print("\n└");
        for (int i = 0; i < 8; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");

                
                        
        
    }
    
    

}
