/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 *
 * 
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
    columnas relleno con números aleatorios entre 200 y 300. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal.
 * 
 * @author PocyxDesigner
 */
public class Bidi11 {
    static int f=0;
    static int c=0;
    public static void main(String[] args) {
        int [][] matriz = new int[10][10];
        
        int max = MIN_VALUE;
        int min = MAX_VALUE;
        int suma = 0;
        
        for(int i=0;i<10;i++){
            for(int e=0;e<10;e++){
                int n = (int) (Math.random()*100)+200;
                matriz[i][e]=n;
            }
        }
        
        for(int f=0;f<10;f++){
            for(int c=0;c<10;c++){
                if(f==c){
                    suma=suma+matriz[f][c];
                    if(max<matriz[f][c]){
                        max=matriz[f][c];
                    }
                    if(min>matriz[f][c]){
                        min=matriz[f][c];
                    }
                    System.out.print(matriz[f][c]);
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        System.out.println("Media: "+(suma/10));
    }
}
