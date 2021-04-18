

package explicacio_excepcions;

import java.io.*;

public class Excepcio_08_prova3 {


    public static void main(String[] args) {
        
        Excepcio_08 exc = new Excepcio_08();
        
        try {
            exc.metodeAmbClausulaThrows("/home/david/arxiuA.txt");            
        }catch (FileNotFoundException e) {
            System.out.println("S’ha capturat l’excepció FileNotFoundException,amb informació:");
            System.out.println(e);
        }catch (IOException e) {
            System.out.println("S’ha capturat l’excepció IOException, amb informació:");
            System.out.println(e);
        }
        
        System.out.println("El programa ha finalitzat.");
    }
}
