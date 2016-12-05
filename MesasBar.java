/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class MesasBar {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //true si hay sitio en alguna mesa.
        boolean mesaLibre = true;
        //true si no hay sitio.
        boolean noHaySitio = false;
        //Array de 10 mesas con una ocupacion de 0 a 4 personas cada una.
        int[] ocupacion = new int[10];

        // Genera el array con un número aleatorio de personas en cada mesa entre 0 y 4.
        for (int i = 0; i < 10; i++) {
          ocupacion[i] = (int)(Math.random() * 5) ;
        }

        // Muestra el array con las ocupaciones en sus mesas.  
        System.out.println("\n\nEstado ocupacional de las mesas:");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
          System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Mesa nº ");
        for (int i = 1; i < 11; i++) {
          System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
          System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│Ocupación");
        for (int i = 0; i < 10; i++) {
          System.out.printf("  %5d   ", ocupacion[i]);
        }

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
          System.out.print("─────┴");
        }
        System.out.print("────┘");

        
        Scanner s = new Scanner(System.in);
        //Numero de personas queintroduce el usuario.
        int numeroPersonas;
        do {
            // Pide un número de personas para sentarse, 4 maximo.
            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            numeroPersonas = Integer.parseInt(s.nextLine());

            //si el usuario introduce -1 el programa acaba.
            if (numeroPersonas == -1 ){
                break;
            //si el numero de personas esta entre 1 y 3, el programa busca una mesa libre 
            //con preferencia a las que tienen 0 ocupantes.
            }else if (numeroPersonas > 0 && numeroPersonas <=4){
                //iniciamos las variables boolean a true.
                mesaLibre = true;
                noHaySitio = true;
                for(int i=0; i<ocupacion.length;i++){
                    //Si no queda mesa con sitio pone noHaySitio en false.
                    if(ocupacion[i]+numeroPersonas <= 4){
                        noHaySitio = false;
                    }
     
                }
                //si no hay nadie sentado en alguna mesa.
                for(int i=0; i<ocupacion.length;i++){
                    if(ocupacion[i] == 0){
                        System.out.println("Por favor sientese en la mesa "+(i+1));
                        ocupacion[i]=numeroPersonas;
                        mesaLibre = false;
                        break;
                    }
                }
                //si hay sitio aunque no este libre completamente.
                if(mesaLibre){
                    for(int i=0; i<ocupacion.length;i++){
                        if (ocupacion[i] != 0){
                            if(ocupacion[i] > 0 && ocupacion[i] < 4 && numeroPersonas+ocupacion[i]<5){
                                System.out.println("Tendra que compartir mesa, Por favor sientese en la mesa "+(i+1));
                                ocupacion[i]=numeroPersonas+ocupacion[i];
                                break;
                            } 
                            
                        }
                    
                    }
                }
                //si no hay sitio en ninguna mesa
                if(noHaySitio){
                    System.out.println("LO sentimos no queda sitio libre, intentelo mas tarde. ");
                    break;
                }
                
            }else{
                System.out.print("Por favor, introduzca un número entre 1 y 4. ");
            }
          
          
            // Muestra el resultado.
            System.out.println("\n\nEstado ocupacional de las mesas:");

            System.out.print("┌");
            for (int i = 0; i < 10; i++) {
              System.out.print("─────┬");
            }
            System.out.print("────┐");
            System.out.print("\n│ Mesa nº ");
            for (int i = 1; i < 11; i++) {
              System.out.printf(" %5d    ", i);
            }

            System.out.print("\n├");
            for (int i = 0; i < 10; i++) {
              System.out.print("─────┼");
            }
            System.out.print("────┤");
            System.out.print("\n│Ocupación");
            for (int i = 0; i < 10; i++) {
              System.out.printf("  %5d   ", ocupacion[i]);
            }

            System.out.print("\n└");
            for (int i = 0; i < 10; i++) {
              System.out.print("─────┴");
            }
            System.out.print("────┘");
          
          

          
        } while (true);

       

        
    }
    
}
