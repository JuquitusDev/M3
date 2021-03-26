/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5__ExempleSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alfredo
 */
public class Garatge {

    private Set<Cotxe> cotxes = new TreeSet<>();
    private String nom;

    public Garatge(String nom) {
        this.nom = nom;
    }

    public Set<Cotxe> getCotxes() {
        return cotxes;
    }

    public void setCotxes(HashSet<Cotxe> cotxes) {
        this.cotxes = cotxes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean afegir(Cotxe c) {
        return cotxes.add(c);
    }

    public void Llista() {
        System.out.println("Garatge Nom: " + this.nom);
        for (Cotxe c : cotxes) {
            System.out.println(c.toString());
        }
    }

    public void LlistaMatricula() {
        TreeSet<Cotxe> tx = new TreeSet<>();

        tx.addAll(cotxes);

        System.out.println("Garatge Nom: " + this.nom);
        for (Cotxe c : tx) {
            System.out.println(c.toString());
        }
    }

    public void LlistaAnyMatricula() {
        CotxeAnyComparator cmp = new CotxeAnyComparator();
        TreeSet<Cotxe> tx = new TreeSet<>(cmp);

        tx.addAll(cotxes);

        System.out.println("Garatge Nom: " + this.nom);
        for (Cotxe c : tx) {
            System.out.println(c.toString());
        }
    }
}
