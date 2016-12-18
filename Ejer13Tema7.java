/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;
import java.util.Scanner;

/**
 *
 * Escribe un programa que rellene un array de 100 elementos con números enteros
    aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
    el programa mostrará el array y preguntará si el usuario quiere destacar el
    máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
    el número destacado entre dobles asteriscos.
 * 
 * 
 * @author PocyxDesigner
 */
public class Ejer13Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int [] aleatorios = new int[100];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<aleatorios.length;i++){
            aleatorios[i]=(int)(Math.random()*501);
            
            
        }
        for(int i=0;i<19;i++){
            System.out.print(" "+aleatorios[i]);
        }
        System.out.println(" ");
        for(int i=20;i<39;i++){
            System.out.print(" "+aleatorios[i]);
        }
        System.out.println(" ");
        for(int i=40;i<59;i++){
            System.out.print(" "+aleatorios[i]);
        }
        System.out.println(" ");
        for(int i=60;i<79;i++){
            System.out.print(" "+aleatorios[i]);
        }
        System.out.println(" ");
        for(int i=80;i<100;i++){
            System.out.print(" "+aleatorios[i]);
        }
        System.out.println();
        boolean min = false;
        boolean max = false;
        //
        
        System.out.println("Desea marcar: 1)el maximo o 2)el minimo?");
        int introducido = Integer.parseInt(s.nextLine());
        for(int i=0; i<aleatorios.length;i++){
            if(aleatorios[i]<minimo){
                minimo = aleatorios[i];
            }
            if(aleatorios[i]>maximo){
                maximo = aleatorios[i];
            }
            
        }
        
        if(introducido == 1){
            for(int i=0; i<aleatorios.length;i++){
       
                if(aleatorios[i]>maximo){
                    maximo = aleatorios[i];
                }
            }
        
        }else if(introducido == 2){
            for(int i=0; i<aleatorios.length;i++){
                if(aleatorios[i]<minimo){
                    minimo = aleatorios[i];
                }
            }
        }
        if(introducido == 1){
            for(int i=0;i<100;i++){
                System.out.print(" "+aleatorios[i]);
                if(aleatorios[i]==maximo){
                    System.out.print(" ["+aleatorios[i]+"] ");
                }
        }
        }else if(introducido == 2){
            for(int i=0;i<100;i++){
                System.out.print(" "+aleatorios[i]);
                if(aleatorios[i]==minimo){
                    System.out.print(" ["+aleatorios[i]+"] ");
                }
            }
        }
        
        
        
        
    }
    
}
