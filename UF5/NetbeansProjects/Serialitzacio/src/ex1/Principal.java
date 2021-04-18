r/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author marc
 */
public class Principal {

    final static String nomFitxer = "casa";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileOutputStream fos = new FileOutputStream(nomFitxer, false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        setEscritura(oos);
        oos.close();
        getLectura(nomFitxer);

    }
      public static void setEscritura(ObjectOutputStream oos) {
        try {
            Propietari pro1 = new Propietari("Pedro", "48056834H");
            oos.writeObject(new Casa(pro1, "avenida", "lleida", 23));
            oos.writeObject(new Casa(pro1, "cami", "lliça", 34));
            oos.writeObject(new Casa(pro1, "caminata", "barcelona", 37));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
      public static void getLectura(String nFitxer) {
        Casa p = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            while (true) {
                p = (Casa) ois.readObject();
                System.out.println("Popietario: " + p.getPropietari());
                System.out.println("Calle: " + p.getCarrera());
                System.out.println("Ciudad: " + p.getCiutat());
                System.out.println("Num inquilins: " + p.getNumInquilins());
                System.out.println("*********************");

            }
        } catch (EOFException exc) {
            System.out.println("\n**************** FIN ARXIU**************");
        } catch (Exception io) {
            io.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
