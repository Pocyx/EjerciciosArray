/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

/**
 *
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
    y asigna los valores según la siguiente tabla. Muestra el contenido de todos
    los elementos del array dispuestos en forma de tabla como se muestra en la
    figura.
 * 
 * 
 * @author PocyxDesigner
 */
public class Bidi1 {
    public static void main(String[] args) {
        int [][] num = new int[3][6];
        num [0][0] = 0;
        num [0][1] = 30;
        num [0][2] = 2;
        num [0][5] = 5;
        num [1][0] = 75;
        num [1][4] = 0;
        num [2][2] = -2;
        num [2][3] = 9;
        num [2][5] = 11;
        System.out.printf("        %10s%10s%10s%10s%10s%10s","Columna 0","Columna 1","Columna 2","Columna 3","Columna 4","Columna 5");
        System.out.println();
        for (int i=0; i<3;i++){
            System.out.print("Fila "+i+": ");
            for(int e=0;e<6;e++){
                System.out.printf("%10d",num[i][e]);
            }
            System.out.println();
        }
    }
}
