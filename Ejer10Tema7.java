/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
    y que los almacene en un array. El programa debe ser capaz de pasar todos
    los números pares a las primeras posiciones del array (del 0 en adelante) y
    todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
    es necesario.
 * 
 * @author PocyxDesigner
 */
public class Ejer10Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] aleatorios = new int[20];
        for(int i=0;i<aleatorios.length;i++){
            aleatorios[i]=(int) (Math.random()*101);
            System.out.print(" "+aleatorios[i]+" ");
        }
        int [] ordenados = new int[20];
        int orden = 0;
        System.out.println("");
        for(int i=0;i<aleatorios.length;i++){
            if(aleatorios[i]%2==0){
                ordenados[orden]=aleatorios[i];
                System.out.print(" '"+aleatorios[i]+"' ");
                orden++;
            }
            
        }
        
        for(int i =0;i<aleatorios.length;i++){
            if(aleatorios[i]%2!=0){
                ordenados[orden]=aleatorios[i];
                System.out.print(" '"+aleatorios[i]+"' ");
                orden++;
            }
        }
    }
}
