/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2b;

import java.util.Scanner;

/**
 *
 * @author Celeste
 */
public class Ejercicio2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String raza="";
	String razas[][] = new String [3][3];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese raza de perro: ");
        for(int f=0; f<3; f++){
            for (int c=0; c<3; c++){
                razas[f][c]=teclado.nextLine();

            }

        }
    //Recorrer y mostrar razas
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                raza= razas [f][c];
                System.out.println("En la fila "+f+" y columna "+c+" se encuentra la raza: "+raza);
            }
        }
    }
    
}
