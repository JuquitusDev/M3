package explicacio_excepcions;

import java.io.*;

public class Excepcio_08 {

    /*
    Exemple de delegació de gestió d’excepcions
     */
    public void metodeAmbClausulaThrows(String nomFitxer) throws FileNotFoundException, IOException {

        FileOutputStream f = new FileOutputStream(nomFitxer);
        f.close();
        System.out.println("El metodeAmbClausulaThrows ha finalitzat.");
    }

}
