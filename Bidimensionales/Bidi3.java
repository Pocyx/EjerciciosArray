/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;



/**
 *
 * Modifica el programa anterior de tal forma que los números que se introducen
   en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author PocyxDesigner
 */
public class Bidi3 {
    public static void main(String[] args) throws InterruptedException {
        int [][] num = new int[4][5];
        int [] sumaFila = new int [4];
        int [] sumaColumna = new int [5];
        for (int i=0; i<4;i++){
            
            for(int e=0;e<5;e++){
                int n = (int)((Math.random()*899)+100);
                num[i][e] = n;
            }
            
        }
        
        //
        for (int i=0; i<4;i++){
            
            for(int e=0;e<5;e++){
                sumaFila[i]=num[i][e]+sumaFila[i];
            }
            
        }
        System.out.println();
       ////////////////////////////
        System.out.printf("        %10s%10s%10s%10s%10s","Columna 0","Columna 1","Columna 2","Columna 3","Columna 4");
        System.out.println();
        for (int i=0; i<4;i++){
            System.out.print("Fila "+i+": ");
            for(int e=0;e<5;e++){
                System.out.printf("%10d",num[i][e]);
            }
            System.out.print(" Total Fila "+i+" = "+sumaFila[i]);
            System.out.println();
        }
        System.out.print("TotalC: ");
        //
        int totColumnas =0;
        for (int i=0; i<5;i++){
            
            for(int e=0;e<4;e++){
                sumaColumna[i]=num[e][i]+sumaColumna[i];
                
            }
            System.out.printf("%10d",sumaColumna[i]);
            totColumnas = totColumnas+sumaColumna[i];
            
        }
        System.out.println(" Total Columnas = "+totColumnas);
        System.out.println();
    }
}
