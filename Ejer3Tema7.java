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
 * 
 * Escribe un programa que lea 12 números por teclado y que luego los muestre
    en orden inverso, es decir, el primero que se introduce es el último en
    mostrarse y viceversa.
 * 
 */
public class Ejer3Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[12];
        for(int i = 0;i<num.length;i++){
            System.out.println("Posicion del array "+(i+1)+" : ");
            num[i]= Integer.parseInt(s.nextLine());
        }
        
        for(int i = num.length-1;i>=0;i--){
            System.out.println("Posicion del array "+(i+1)+" : "+num[i]);

        }
    }
}
