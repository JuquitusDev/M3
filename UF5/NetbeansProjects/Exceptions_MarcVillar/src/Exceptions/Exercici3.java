/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.util.Scanner;

/**
 *
 * @author Juquitus
 */
public class Exercici3 {

    public static void main(String[] args){

        System.out.println("Estem en el main i cridem al metode de les excepcions");
        try{
        metodeExcepcions();
        }catch(Exc e){
            System.out.println("Catch del main. Error: ");
            e.printStackTrace();
        }
        System.out.println("Hem executat el metode i tornem al main");

    }

    public static void metodeExcepcions() throws Exc {
        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {
            System.out.println("Abans d’executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posició " + i + " : " + t[i]);
            }
            System.out.println("Després d’executar el for");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El programador s’ha sortit de límits: " + e.getMessage());
            System.out.println("\n\n\n\n");
        }

        try {
            String c;
            System.out.println(c);
        } catch (RuntimeException rte) {
            System.out.println("El programador no ha declarat la variable c. Error: " + rte.getMessage());
        }

        Scanner input = new Scanner(System.in);
        int dividend = 2;
        System.out.println("Escull el nombre pel que vols dividir 2: ");
        int divisor = input.nextInt();
        if (divisor == 0) {
            throw new Exc(divisor);
        }
        System.out.println("El programa s'ha executat sense errors");
    }

}
