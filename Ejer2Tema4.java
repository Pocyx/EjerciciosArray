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
 * 
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
    elementos según la tabla que se muestra a continuación. Muestra el contenido
    de todos los elementos del array. ¿Qué sucede con los valores de los elementos
    que no han sido inicializados?- Aparece vacío.
 */
public class Ejer2Tema4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] simbolo = new char[10];
        //char[] simbolo = {0,0,0,0,0,0}
        
        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]=' ';
        simbolo[7]='+';
        simbolo[8]='Q';
        
        for(int i = 0;i<simbolo.length;i++){
            System.out.println("Posicion "+i+" "+simbolo[i]);
        }
        System.out.println("El array quedaría: "+simbolo[2] );
    }
    
}
