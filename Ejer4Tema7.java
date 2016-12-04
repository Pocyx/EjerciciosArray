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
 
 
 Define tres arrays de 20 números enteros cada una, con nombres cubo,
    cubo y cubo. Carga el array cubo con valores aleatorios entre 0 y 100. En el
    array cubo se deben almacenar los cuadrados de los valores que hay en el
    array cubo. En el array cubo se deben almacenar los cubos de los valores que
    hay en cubo. A continuación, muestra el contenido de los tres arrays dispuesto
    en tres columnas.
 */
public class Ejer4Tema7 {
    
    public static void main(String[] args) {
    
    
    //Array de 20 numeros aleatorios entre 0 y 100
    int[] numero = new int[20];

    // Genera el array
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 100);
    }

    // Muestra el array original.  
    System.out.println("\n\nNumeros aleatorios entre 0-100:");

    System.out.print("┌");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┬");
    }
    System.out.print("────┐");
    System.out.print("\n│ Índice ");
    for (int i = 0; i < 20; i++) {
      System.out.printf(" %5d    ", i);
    }

    System.out.print("\n├");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┼");
    }
    System.out.print("────┤");
    System.out.print("\n│ Valor  ");
    for (int i = 0; i < 20; i++) {
      System.out.printf("  %5d   ", numero[i]);
    }

    System.out.print("\n└");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┴");
    }
    System.out.print("────┘");
    
    
    
    //Array de 20 numeros cuadrados 
    int[] cuadrado = new int[20];
    


    // Genera el array
    for (int i = 0; i < 20; i++) {
      cuadrado[i] = numero[i]*numero[i];
    }

    // Muestra el array de numeros cuadrador.  
    System.out.println("\n\nArray de los 20 numeros al cuadrado: ");

    System.out.print("┌");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┬");
    }
    System.out.print("────┐");
    System.out.print("\n│ Índice ");
    for (int i = 0; i < 20; i++) {
      System.out.printf(" %5d    ", i);
    }

    System.out.print("\n├");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┼");
    }
    System.out.print("────┤");
    System.out.print("\n│ Valor  ");
    for (int i = 0; i < 20; i++) {
      System.out.printf("  %5d   ", cuadrado[i]);
    }

    System.out.print("\n└");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┴");
    }
    System.out.print("────┘");
    
    //Array de 20 numeros al cubo 
    int[] cubo = new int[20];
    


    // Genera el array
    for (int i = 0; i < 20; i++) {
      cubo[i] = numero[i]*numero[i]*numero[i];
    }

    // Muestra el array de numeros cuadrador.  
    System.out.println("\n\nArray de los 20 numeros al cubo: ");

    System.out.print("┌");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┬");
    }
    System.out.print("────┐");
    System.out.print("\n│ Índice ");
    for (int i = 0; i < 20; i++) {
      System.out.printf(" %5d    ", i);
    }

    System.out.print("\n├");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┼");
    }
    System.out.print("────┤");
    System.out.print("\n│ Valor  ");
    for (int i = 0; i < 20; i++) {
      System.out.printf("  %5d   ", cubo[i]);
    }

    System.out.print("\n└");
    for (int i = 0; i < 20; i++) {
      System.out.print("─────┴");
    }
    System.out.print("────┘");
    
    
    

    
  }
    
}
