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
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
    columnas relleno con números aleatorios entre 500 y 900. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal.
 * 
 * @author PocyxDesigner
 */
public class Bidi12 {
    static int f=0;
    static int c=0;
    public static void main(String[] args) {
        int [][] matriz = new int[9][9];
        
        int max = MIN_VALUE;
        int min = MAX_VALUE;
        int suma = 0;
        
        for(int i=0;i<9;i++){
            for(int e=0;e<9;e++){
                int n = (int) (Math.random()*400)+500;
                matriz[i][e]=n;
            }
        }
        
        for(f=0;f<9;f++){
            for(c=0;c<9;c++){
                if(f+c==9){
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
        System.out.println("Media: "+(suma/9));
    }
}
