/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1e;

import java.util.Scanner;

/**
 *
 * @author Celeste
 */
public class Ejercicio1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ciudadMax, ciudadMin;
        int min,max;
        min=900;
        max=0;
        ciudadMax="";
        ciudadMin="";

	    String ciudades [] = new String[5];
        System.out.println("Ingrese nombre de las 5 ciudades: ");
        for(int i=0;i<ciudades.length;i++) {
            Scanner teclado = new Scanner (System.in);
            ciudades[i] = teclado.nextLine();

        }

        int temperaturasMaximas [] = new int [5];
        for (int i=0;i<temperaturasMaximas.length;i++) {
            System.out.println("Ingrese temperatura máxima de "+ciudades[i]+": ");
            Scanner teclado1 = new Scanner (System.in);
            temperaturasMaximas[i] = teclado1.nextInt();

            if(temperaturasMaximas[i]>max) {
                max=temperaturasMaximas[i];
                ciudadMax= ciudades[i];
            }
        }


        int temperaturasMinimas [] = new int[5];
        for (int i=0;i<temperaturasMinimas.length;i++){
            System.out.println("Ingrese temperatura mínima de "+ciudades[i]+": ");
            Scanner teclado2 = new Scanner (System.in);
            temperaturasMinimas[i] = teclado2.nextInt();

            if(temperaturasMinimas[i]<min){
                min=temperaturasMinimas[i];
                ciudadMin=ciudades[i];
            }
        }
        System.out.println("La ciudad con la temperatura más alta fue " +ciudadMax+ " con "+max+"ºC, mientras que la ciudad con la temperatura" +
                " más baja fue "+ciudadMin+" con "+min+"ºC.");
    }
    
}
