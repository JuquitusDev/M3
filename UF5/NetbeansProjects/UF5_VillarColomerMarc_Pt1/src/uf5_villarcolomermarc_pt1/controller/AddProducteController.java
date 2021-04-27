/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_villarcolomermarc_pt1.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import uf5_villarcolomermarc_pt1.model.Categoria;
import uf5_villarcolomermarc_pt1.model.Magatzem;
import uf5_villarcolomermarc_pt1.model.Producte;

/**
 *
 * @author Marc
 */
public class AddProducteController {

    final static String NOM_FITXER = "C:\\Users\\Juquitus\\Desktop\\M3\\M3\\UF5\\NetbeansProjects\\UF5_VillarColomerMarc_Pt1\\src\\productes.bin";

    Magatzem m = null;

    public AddProducteController(Magatzem m) {
    
    this.m = m;
    }

    public Magatzem getM() {
        return m;
    }

    public void setM(Magatzem m) {
        this.m = m;
    }
    
    
    
    public static String getNomFitxer() {
        return NOM_FITXER;
    }

  
    
    
    
    public static boolean cargarMagatzem(String nom) {
        if (getLectura(nom) != null) {
            return true;
        }
        return false;
    }

    /*    
    public static void setEscritura(ObjectOutputStream oos) {
        try {
            Propietari pro1 = new Propietari("Pedro", "48056834H");
            oos.writeObject(new Casa(pro1, "avenida", "lleida", 23));
            oos.writeObject(new Casa(pro1, "cami", "lliça", 34));
            oos.writeObject(new Casa(pro1, "caminata", "barcelona", 37));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
    public static Magatzem getLectura(String nFitxer) {
        Magatzem m = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            m = (Magatzem) ois.readObject();
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
        return m;
    }

    public static ArrayList<Categoria> listCategories() {
        Categoria c1 = new Categoria("categoria1");
        Categoria c2 = new Categoria("categoria2");
        Categoria c3 = new Categoria("categoria3");
        Categoria c4 = new Categoria("categoria4");
        ArrayList<Categoria> aCat = new ArrayList<>();
        aCat.add(c1);
        aCat.add(c2);
        aCat.add(c3);
        aCat.add(c4);
        return aCat;
    }

    public static String validarCodi(String codi) {
        try {
            Integer.parseInt(codi);
        } catch (Exception e) {
            return "El codi introduit no és numèric";
        }
        return "";
    }

//  String preu, String ubi, String categoria, String tipus, boolean oferta, String stock
    public static String validarPreu(String preu) {
        try {
            Double.parseDouble(preu);
        } catch (Exception e) {
            return "El preu introduit no és numèric";
        }
        return "";
    }

    public static String validarStock(String stock) {
        try {
            Integer.parseInt(stock);
        } catch (Exception e) {
            return "L'stock introduit no és numèric";
        }
        return "";
    }

    public static String validarUbicacio(String ubi) {
        if (ubi.length() != 3) {
            return "la longitud ha de ser de 3 caràcters";
        }
        return "";
    }

    public static String submitProducte(Producte p) {
       Magatzem m = new Magatzem();
        try {
            m.afegir(p);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        m = actualitzarMagatzem(m);
        System.out.println(m.toString());
        return "";
    }
    
    
    public static Magatzem actualitzarMagatzem(Magatzem m) {
      
    }
    
    
}
