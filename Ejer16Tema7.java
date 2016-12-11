/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Escribe un programa que rellene un array de 20 elementos con números enteros
    aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
    el programa mostrará el array y preguntará si el usuario quiere resaltar los
    múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
    array escribiendo los números que se quieren resaltar entre corchetes.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer16Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] aleatorios = new int[20];
        for(int i=0;i<aleatorios.length;i++){
            aleatorios[i]=(int) (Math.random()*401);
            System.out.print(" "+aleatorios[i]+" ");
        }
        Scanner s = new Scanner(System.in);
        System.out.print("\n1.Resaltar multiplos de 5 o 2.Resaltar multiplos de 7 ");
        int valor = Integer.parseInt(s.nextLine());
        if(valor == 1){
            for(int i=0;i<aleatorios.length;i++){
                if(aleatorios[i]%5==0){

                    System.out.print(" ["+aleatorios[i]+"] ");
                }else{
                    System.out.print(" "+aleatorios[i]+" ");
                }
            
            }
        }else if(valor == 2){
            for(int i=0;i<aleatorios.length;i++){
                if(aleatorios[i]%7==0){

                    System.out.print(" ["+aleatorios[i]+"] ");
                }else{
                    System.out.print(" "+aleatorios[i]+" ");
                }
            }
        }
        
        
    }
}
