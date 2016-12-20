/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysbidimensionales;

/**
 *
 * 
 *9)Realiza un programa que sea capaz de rotar todos los elementos de una
    matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
    debe tener 12 filas por 12 columnas y debe contener números generados al
    azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
    resultado, ambas con los números convenientemente alineados.
 * 
 * @author PocyxDesigner
 */
public class Bidi9 {
    public static void main(String[] args) {
        int[][] matriz = new int[12][12];
        int[][] rotado = new int[12][12];
        for(int i=0;i<12;i++){
            for(int e=0;e<12;e++){
                matriz[i][e]=(int)(Math.random()*100);
            }
        }
        
        for(int i=0;i<12;i++){
            for(int e=0;e<12;e++){
                System.out.printf("%3d",matriz[i][e]);
            }
            System.out.println();
        }
        
        ///1arriba
        for(int i=0;i<11;i++){
            
            rotado[0][i+1]=matriz[0][i];
        }
        ///1
        ///2arriba
        for(int i=1;i<10;i++){
            
            rotado[1][i+1]=matriz[1][i];
        }
        ///2
        ///3arriba
        for(int i=2;i<9;i++){
            
            rotado[2][i+1]=matriz[2][i];
        }
        ///3
        ///4arriba
        for(int i=3;i<8;i++){
            
            rotado[3][i+1]=matriz[3][i];
        }
        ///4
        ///5arriba
        for(int i=4;i<7;i++){
            
            rotado[4][i+1]=matriz[4][i];
        }
        ///5
        ///6arriba
        for(int i=5;i<6;i++){
            
            rotado[5][i+1]=matriz[5][i];
        }
        ///6
        
        ///1abajo
        for(int i=11;i>0;i--){
            
            rotado[11][i-1]=matriz[11][i];
        }
        ///1
        ///2abajo
        for(int i=10;i>1;i--){
            
            rotado[10][i-1]=matriz[10][i];
        }
        ///2
        ///3abajo
        for(int i=9;i>2;i--){
            
            rotado[9][i-1]=matriz[9][i];
        }
        ///3
        ///4abajo
        for(int i=8;i>3;i--){
            
            rotado[8][i-1]=matriz[8][i];
        }
        ///4
        ///5abajo
        for(int i=7;i>4;i--){
            
            rotado[7][i-1]=matriz[7][i];
        }
        ///5
        ///6abajo
        for(int i=6;i>5;i--){
            
            rotado[6][i-1]=matriz[6][i];
        }
        ///6
        
        ///1derecha
        for(int i=0;i<11;i++){
            
            rotado[i+1][11]=matriz[i][11];
        }
        ///1
        ///2derecha
        for(int i=1;i<10;i++){
            
            rotado[i+1][10]=matriz[i][10];
        }
        ///2
        ///3derecha
        for(int i=2;i<9;i++){
            
            rotado[i+1][9]=matriz[i][9];
        }
        ///3
        ///4derecha
        for(int i=3;i<8;i++){
            
            rotado[i+1][8]=matriz[i][8];
        }
        ///4
        ///5derecha
        for(int i=4;i<7;i++){
            
            rotado[i+1][7]=matriz[i][7];
        }
        ///5
        ///6derecha
        for(int i=5;i<6;i++){
            
            rotado[i+1][6]=matriz[i][6];
        }
        ///6
        
        ///1izquierda
        for(int i=11;i>0;i--){
            
            rotado[i-1][0]=matriz[i][0];
        }
        ///1
        ///2izquierda
        for(int i=10;i>1;i--){
            
            rotado[i-1][1]=matriz[i][1];
        }
        ///2
        ///3izquierda
        for(int i=9;i>2;i--){
            
            rotado[i-1][2]=matriz[i][2];
        }
        ///3
        ///4izquierda
        for(int i=8;i>3;i--){
            
            rotado[i-1][3]=matriz[i][3];
        }
        ///4
        ///5abajo
        for(int i=7;i>4;i--){
            
            rotado[i-1][4]=matriz[i][4];
        }
        ///5
        ///6izquierda
        for(int i=6;i>5;i--){
            
            rotado[i-1][5]=matriz[i][5];
        }
        ///6
        
        
        
        /**
        //rotar
        for(int i=0;i<12;i++){
            for(int e=0;e<12;e++){
                if(e<11 && i==0){
                    rotado[i][e+1]=matriz[i][e];
                }else if(i==0 && e==11){
                    rotado[i+1][e]=matriz[i][e];
                }else if(i==0 && e<11){
                    rotado[i+2][e]=matriz[i][e];
                }else if(i<11 && e==11 ){
                    rotado[11][e]=matriz[0][e];
                }
                //System.out.printf("%3d",matriz[i][e]);
            }
            System.out.println();
        }*/
        System.out.println();
        //mostrar rotado
        for(int i=0;i<12;i++){
            for(int e=0;e<12;e++){
                System.out.printf("%3d",rotado[i][e]);
            }
            System.out.println();
        }
        
    }
}
