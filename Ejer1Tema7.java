/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

/**
 *
 * @author PocyxDesigner
 * 
 * Define un array de 12 números enteros con nombre num y asigna los valores
    según la tabla que se muestra a continuación. Muestra el contenido de todos
    los elementos del array. ¿Qué sucede con los valores de los elementos que no
    han sido inicializados?- que automaticamente se le asigna 0 a la posicion no asignada.
 */
public class Ejer1Tema7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[12];
        
        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;
        
        for(int i = 0;i<=11;i++){
            System.out.println("Posicion "+i+" "+num[i]);
        }
        
        System.out.println("El array quedaría: "+num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9]);
    }
}
