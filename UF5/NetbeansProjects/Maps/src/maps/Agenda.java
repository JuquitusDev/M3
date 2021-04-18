/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Juquitus
 */
public class Agenda {

    private Set<Contacte> contactes;

    public Agenda() {
        this.contactes = new HashSet<>();
    }

    public boolean afegir(Contacte c) {
        return contactes.add(c);
    }

    public boolean esborrar(String nom) {
        Contacte c = new Contacte(nom, "", "", "");
        return contactes.remove(c);
    }

    public void mostrarDadesContacte(String nom) {
        for (Contacte contacte : contactes) {
             if (contacte.getNom().equals(nom)){
                 System.out.println(contacte.toString());
             }
        }
    }

    public void llistaOrdenatNom() {
        TreeSet<Contacte> tx = new TreeSet<>();

        tx.addAll(contactes);

        for (Contacte c : tx) {
            System.out.println(c.toString());
        }
    }
    
    public void mostrarContactesLletraNom(char lletra) {
   for (Contacte contacte : contactes) {
             if (contacte.getNom().charAt(0) == lletra){ 
                 System.out.println(contacte.toString());
             }
        }
    }
    public void mostrarContactesPoblacio(String poblacio) {
   for (Contacte contacte : contactes) {
             if (contacte.getPoblacio().startsWith(poblacio)){ 
                 System.out.println(contacte.toString());
             }
        }
    }
}
