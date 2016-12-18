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
 * @author PocyxDesigner
 */
public class Bidi6 {
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
                //comprueba que no se repite antes de meterlo.
                for (int i2=0; i2<i;i2++){
                    for(int e2=0;e2<e;e2++){
                        if(n!=num[i][e]){
                            num[i][e] = n;
                        }
                    }
                }
            
           
                
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
