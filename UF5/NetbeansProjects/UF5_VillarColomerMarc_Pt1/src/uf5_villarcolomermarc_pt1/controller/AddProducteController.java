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
import java.util.Set;
import uf5_villarcolomermarc_pt1.model.Categoria;
import uf5_villarcolomermarc_pt1.model.Magatzem;
import uf5_villarcolomermarc_pt1.model.Producte;
import uf5_villarcolomermarc_pt1.view.Menu;

/**
 *
 * @author Marc
 */
public class AddProducteController {

    private Magatzem m;
    private Menu menu;
    final static String NOM_FITXER = "C:\\Users\\Juquitus\\Desktop\\M3\\M3\\UF5\\NetbeansProjects\\UF5_VillarColomerMarc_Pt1\\src\\productes.bin";

    public AddProducteController() {
        this.m = new Magatzem();
        this.menu = new Menu(this);
        this.menu.setVisible(true);
    }

    public String getNomFitxer() {
        return NOM_FITXER;
    }

    public boolean cargarMagatzem(String nom) {
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
    public Magatzem getLectura(String nFitxer) {
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

    public ArrayList<Categoria> listCategories() {
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

    public String validarCodi(String codi) {
        int intcodi = 0;
        try {
            intcodi = Integer.parseInt(codi);
        } catch (Exception e) {
            return "El codi introduit no és numèric";
        }

        try {
           Producte p =  m.getProductes().get(intcodi);
           if(p != null){
            return "El codi actual està duplicat";
           }else{
               return "";
           }
        } catch (Exception e) {
            return "error";
        }

    }

//  String preu, String ubi, String categoria, String tipus, boolean oferta, String stock
    public String validarPreu(String preu) {
        try {
            Double.parseDouble(preu);
        } catch (Exception e) {
            return "El preu introduit no és numèric";
        }
        return "";
    }

    public String validarStock(String stock) {
        try {
            Integer.parseInt(stock);
        } catch (Exception e) {
            return "L'stock introduit no és numèric";
        }
        return "";
    }

    public String validarUbicacio(String ubi) {
        if (ubi.length() != 3) {
            return "la longitud ha de ser de 3 caràcters";
        }
        return "";
    }

    public String submitProducte(Producte p) {
        try {
            m.afegir(p);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        Set<Integer> ks = m.getProductes().keySet();
        for (int clau : ks) {
            System.out.println(m.getProductes().get(clau));
        }
        return "";
    }

}
