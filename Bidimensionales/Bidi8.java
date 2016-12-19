/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

import java.util.Scanner;

/**
 *
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
    a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
    indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
    64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
    se indican del 1 al 8.
 * 
 * @author PocyxDesigner
 */
public class Bidi8 {
    public static void main(String[] args) {
        String [][] tablero = new String[8][8];
        String letra = null;
        int posNumero=0;
        int posLetra=0;
        for(int i=0;i<8;i++){
            for(int e=0;e<8;e++){
                switch(e){
                    case 0:
                        letra="a";
                        break;
                    case 1:
                        letra="b";
                        break;
                    case 2:
                        letra="c";
                        break;
                    case 3:
                        letra="d";
                        break;
                    case 4:
                        letra="e";
                        break;
                    case 5:
                        letra="f";
                        break;
                    case 6:
                        letra="g";
                        break;
                    case 7:
                        letra="h";
                        break;
                }
                tablero[i][e]=letra+String.valueOf(i+1);
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la posición del alfil: ");
        String posicion = s.nextLine();
        boolean estaDentro = false;
        for(int i=0;i<8;i++){
            for(int e=0;e<i;e++){
                if(posicion.equals(tablero[i][e])){
                    posLetra=i;
                    posNumero=e;
                    estaDentro=true;
                    System.out.print("good ");
                }
            }
        }
        int posLetra2=posLetra;
        int posNumero2=posNumero;
        
        if(estaDentro){
            for(int i=0;i<posLetra;i++){
                for(int e=0;e<posNumero;e++){
                    posLetra2=posLetra2-1;
                    posNumero2=posNumero2-1;
                    
                    switch(posLetra2-1){
                        case 0:
                            letra="a";
                            break;
                        case 1:
                            letra="b";
                            break;
                        case 2:
                            letra="c";
                            break;
                        case 3:
                            letra="d";
                            break;
                        case 4:
                            letra="e";
                            break;
                        case 5:
                            letra="f";
                            break;
                        case 6:
                            letra="g";
                            break;
                        case 7:
                            letra="h";
                            break;
                    }
                    System.out.println();
                    System.out.println(letra+" "+(posNumero2+2));
                    if(posNumero2<posNumero  ){
                        break;
                    }
                }
                if(posLetra2==1){
                    break;
                }
            }
        }
            
        
        
    }
}
