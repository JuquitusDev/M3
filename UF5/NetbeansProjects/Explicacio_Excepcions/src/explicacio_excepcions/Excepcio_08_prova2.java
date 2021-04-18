

package explicacio_excepcions;

import java.io.*;

public class Excepcio_08_prova2 {


    public static void main(String[] args) {
        
        Excepcio_08 exc = new Excepcio_08();
        try {
            exc.metodeAmbClausulaThrows("/home/david/arxiu.txt");
        }catch (FileNotFoundException e) {
            System.out.println("S’ha capturat l’excepció FileNotFoundException");
        }
        
        System.out.println("El programa ha finalitzat.");
    }
}
