/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_villarcolomermarc_pt1.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author Marc
 */
public class Magatzem implements Serializable{

    private HashMap<Integer, Producte> productes;

    public Magatzem() {
        this.productes = new HashMap<>();
    }

    public HashMap<Integer, Producte> getProductes() {
        return productes;
    }

    public void setProductes(HashMap<Integer, Producte> productes) {
        this.productes = productes;
    }

    
    public void afegir(Producte p) {
        productes.put(p.getCodi(), p);
    }


    @Override
    public String toString() {
        return "Magatzem{" + "productes=" + productes + '}';
    }

}
