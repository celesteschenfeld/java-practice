/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2c;

import java.util.Scanner;

/**
 *
 * @author Celeste
 */
public class Ejercicio2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas [][] = new double [4][4];
        Scanner teclado = new Scanner(System.in);
	    for(int f=0;f<4;f++){
	        System.out.println("Ingrese las 3 notas del Alumno "+(f+1)+": ");
	        for (int c=0; c<3;c++){
	            notas [f][c]= teclado.nextDouble();
            }
        }
	    //Suma de notas y calculo de promedios
	    double sumaNotas;
	    double promedio;
	    for(int f=0; f<4;f++){
	        sumaNotas=0;
	        for(int c=0; c<3; c++){
                sumaNotas=(sumaNotas + notas[f][c]);
            }
           notas[f][3]= sumaNotas / 3;
        }
        //Recorro para mostrar notas y promedio por pantalla
	    for (int f=0;f<4;f++){
            System.out.println("Las notas del alumno " +(f+1)+ " son: ");
	        for (int c=0; c<3; c++){
                System.out.println("Nota "+(c+1)+" "+notas[f][c]);
            }
            System.out.println("El promedio es: "+ notas[f][3]);
        }
    }    
}
