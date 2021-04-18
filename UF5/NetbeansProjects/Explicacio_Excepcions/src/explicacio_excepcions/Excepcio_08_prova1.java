

package explicacio_excepcions;

import java.io.*;

public class Excepcio_08_prova1 {


    public static void main(String[] args) {
        
        Excepcio_08 exc = new Excepcio_08();
        exc.metodeAmbClausulaThrows("/home/david/arxiu.txt");
        System.out.println ("Hem tornat del metodeAmbClasulaThrows");
        System.out.println ("El programa ha finalitzat.");


    }

}
