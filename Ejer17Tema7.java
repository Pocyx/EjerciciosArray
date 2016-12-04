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

public class Ejer17Tema7 {
    
    public static void main(String[] args) {
  
    int[] n = new int[10];

    // Genera el array
    for (int i = 0; i < 10; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
    }

    // Muestra el array original.  
    System.out.println("\n\nArray original:");

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
    System.out.print("\n│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("  %5d   ", n[i]);
    }

    System.out.print("\n└");
    for (int i = 0; i < 10; i++) {
      System.out.print("─────┴");
    }
    System.out.print("────┘");

    // Pide un número que esté dentro del array
    Scanner s = new Scanner(System.in);
    boolean existeNumero = false;
    int numeroIntroducido;
    do {
      System.out.print("\nIntroduzca uno de los números del array: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      // Comprueba si el número introducido se encuentra dentro del array
      for (int elemento : n) {
        if (elemento == numeroIntroducido) {
          existeNumero = true;
        }
      }
      
      if (!existeNumero) {
        System.out.println("Ese número no se encuentra en el array.");
      }
    } while (!existeNumero);
    
    // Rota los el array hasta que el número introducido se coloque en la posición 0
    while (n[0] != numeroIntroducido) {
      int aux = n[9];
      // Rotación a la derecha
      for (int i = 9; i > 0; i--) {
        n[i] = n[i -1];
      }
      n[0] = aux;
    }

    // Muestra el resultado.
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
    System.out.print("\n│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("  %5d   ", n[i]);
    }

    System.out.print("\n└");
    for (int i = 0; i < 10; i++) {
      System.out.print("─────┴");
    }
    System.out.print("────┘"); 
  }
  
}