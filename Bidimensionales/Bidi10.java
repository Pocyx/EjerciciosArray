/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

import java.util.Scanner;

/**
 *Tres en raya.
 * @author PocyxDesigner
 */
public class Bidi10 {
    public static void main(String[] args) {
        int[][] tablero = new int[3][3];
        int [] sumaFila = new int [3];
        int [] sumaColumna = new int [3];
        boolean seguir=true;
        boolean winMaquina = false;
        boolean winPlayer = false;
        do{
            //
            for (int i=0; i<3;i++){
                sumaFila[i]=0;
                sumaColumna[i]=0;
                
            }
            int x = (int) (Math.random()*3);
            int y = (int) (Math.random()*3);
            //1 para la maquina,5para el player y 0 vacio.
            if (tablero[x][y]==0){
                tablero[x][y]=1;
            }
            for(int i=0;i<3;i++){
                for(int e=0;e<3;e++){
                    System.out.print(tablero[i][e]+" ");
                }
                System.out.println();
            }
            Scanner s = new Scanner(System.in);
            System.out.print("Introduzca posición x: ");
            x = Integer.parseInt(s.nextLine());
            System.out.print("Introduzca posición y: ");
            y = Integer.parseInt(s.nextLine());
            if (tablero[y][x]==0){
                tablero[y][x]=5;
            }
            for(int i=0;i<3;i++){
                for(int e=0;e<3;e++){
                    System.out.print(tablero[i][e]+" ");
                }
                System.out.println();
            }
            System.out.println();
            
            for (int i=0; i<3;i++){
            
                for(int e=0;e<3;e++){
                    sumaFila[i]=tablero[i][e]+sumaFila[i];
                    System.out.println("fff "+i+" "+sumaFila[i]);
                }
                
                
                
            }
            //
            for (int i=0; i<3;i++){
            
                for(int e=0;e<3;e++){
                    sumaColumna[i]=tablero[e][i]+sumaColumna[i];
                    System.out.println("ccc "+i+" "+sumaColumna[i]);
                }
                
                
                
            }
            
            //
            for (int i=0; i<3;i++){
                
                if(sumaFila[i]==15 || sumaFila[i]==3){
                    if(sumaFila[i]==15){
                        winPlayer=true;
                    }else if(sumaFila[i]==3){
                        winMaquina=true;
                    }
                    seguir=false;
                    System.out.println("falseF "+sumaFila[i]);
                }
            
               if(sumaColumna[i]==15 || sumaColumna[i]==3){
                    if(sumaColumna[i]==15){
                        winPlayer=true;
                    }else if(sumaColumna[i]==3){
                        winMaquina=true;
                    }
                    seguir=false;
                    System.out.println("falseC "+sumaColumna[i]);
                }
                
            }
            
            
            
        }while(seguir);
        if(winPlayer){
            System.out.println("HAS GANADO!!!!!! ");
        }else if(winMaquina){
            System.out.println("HAS Perdido!!!!!! ");
        }
    }
}
