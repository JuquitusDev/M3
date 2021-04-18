package explicacio_excepcions;

import java.io.*;

public class Excepcio_07 {

    public static void main(String[] args) {

        /*
        Exemple de programa que no gestiona les excepcions de
        gestió obligatòria
         */
        FileOutputStream f = new FileOutputStream("/home/david/arxiu.txt");
        f.close();

    }
}
