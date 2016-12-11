/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre
    los números introducidos junto con las palabras “máximo” y “mínimo” al lado
    del máximo y del mínimo respectivamente.
 * 
 * @author PocyxDesigner
 */
public class Ejer5Tema7 {
    
    /**
     * 
     * for(int num : numeros){
                if(numeros[i]<num){
                    
                    System.out.print("minimo");
                }
                
            }
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        Scanner s = new Scanner(System.in);
    
        for(int i=0; i<numeros.length;i++){
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            numeros[i]=Integer.parseInt(s.nextLine());
            
            if(numeros[i]<minimo){
                minimo = numeros[i];
            }
            if(numeros[i]>maximo){
                maximo = numeros[i];
            }

        }
        String [] limites = new String[10];
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==minimo){
                limites[i]=String.valueOf(numeros[i]+" :minimo ");
            }
            else if(numeros[i]==maximo){
                limites[i]=String.valueOf(numeros[i]+" :maximo ");
            }else{
                limites[i]=String.valueOf(numeros[i]);
            }
            
            
        }
        
        for(int i=0;i<limites.length;i++){
            System.out.println(limites[i]);
        }
        
    }
    
    
    
    
}
