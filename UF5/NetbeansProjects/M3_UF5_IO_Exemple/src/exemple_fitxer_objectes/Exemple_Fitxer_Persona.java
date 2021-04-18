package exemple_fitxer_objectes;

import java.io.EOFException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exemple_Fitxer_Persona {

    final static String nomFitxer = "dades.obj";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream(nomFitxer, false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        setEscritura(oos);
        oos.close();
        System.out.println("1 Vegada -------");
        getLectura(nomFitxer);

        fos = new FileOutputStream(nomFitxer, true);//Se'l passo
        oos = new ObjectOutputStream(fos);// així mateix se'l passo 
        setEscritura(oos);
        oos.close();
        System.out.println("2 Vegades");
        getLectura(nomFitxer);

        fos = new FileOutputStream(nomFitxer, false);//Se'l passo
        ObjectOutputStream oosMO = new ObjectOutputStream(fos);// així mateix se'l passo 
        setEscritura(oosMO);
        oos.close();
       
        
        fos = new FileOutputStream(nomFitxer, true);//Se'l passo
        oosMO = new ObjectOutputStreamAdd(fos);// així mateix se'l passo 
        setEscritura(oosMO);
        oos.close();
        System.out.println("2 Vegades amb MO-------------");
        getLectura(nomFitxer);

        
        System.out.println("List--------------------------");
        ArrayList<Persona> aPer = new ArrayList<>();
        aPer.add(new Persona("Jordi", 40, "23498542Z"));
        aPer.add(new Persona("Carles", 35, "59871235Y"));
        aPer.add(new Persona("Xavier", 52, "58998742D"));
        fos = new FileOutputStream(nomFitxer, false);//Se'l passo
        oos = new ObjectOutputStream(fos);// així mateix se'l passo 
        oos.writeObject(aPer);
        oos.close();
        FileInputStream fis = new FileInputStream(nomFitxer);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            ArrayList<Persona> aP = (ArrayList<Persona>) ois.readObject();
            for (Persona p: aP){
                System.out.println(p);
            }
        } catch (ClassNotFoundException ex) {
            
        }

    }

    public static void setEscritura(ObjectOutputStream oos) {
        try {
            oos.writeObject(new Persona("Jordi", 40, "23498542Z"));
            oos.writeObject(new Persona("Carles", 35, "59871235Y"));
            oos.writeObject(new Persona("Xavier", 52, "58998742D"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getLectura(String nFitxer) {
        Persona p = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            while (true) {
                p = (Persona) ois.readObject();
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("DNI: " + p.getDni());
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
