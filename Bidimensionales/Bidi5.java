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
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
    números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
    A continuación, el programa deberá dar la posición tanto del máximo como
    del mínimo.
 * 
 * @author PocyxDesigner
 */
public class Bidi5 {
    public static void main(String[] args) {
        int [][] num = new int[6][10];
        int max = MIN_VALUE;
        int min = MAX_VALUE;
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;
        for (int i=0; i<6;i++){
            
            for(int e=0;e<10;e++){
                int n = (int)((Math.random()*1000));
                num[i][e] = n;
                if(max<num[i][e]){
                    max=num[i][e];
                    filaMax=i;
                    columnaMax=e;
                }
                if(min>num[i][e]){
                    min=num[i][e];
                    filaMin=i;
                    columnaMin=e;
                }
            }
            
        }
        System.out.println("La posicion del minimo es: Fila "+filaMin+", columna "+columnaMin+
                " y la del maximo fila "+filaMax+", columna "+columnaMax);
    }
}
