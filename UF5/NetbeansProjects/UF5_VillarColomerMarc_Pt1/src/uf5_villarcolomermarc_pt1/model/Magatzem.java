/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_villarcolomermarc_pt1.model;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author Marc
 */
public class Magatzem {

    private HashMap<Integer, Producte> productes;

    public Magatzem() {
        this.productes = new HashMap<>();
    }

    public void afegir(Producte p) {
        productes.put(p.getCodi(), p);
    }

    public void filtrarCategoria(String nomCategoria) {
        Set<Integer> ks = productes.keySet();
        for (int clau : ks) {
            printCategoriaFiltrada(clau, nomCategoria);
        }

    }

    public void printCategoriaFiltrada(int codi, String nomCategoria) {
        Producte p = productes.get(codi);
        if (p.getCategoria().getNom().equals(nomCategoria)) {
            System.out.println(p.toString());
        }
    }
    
      public void filtrarStock(int stockMinim) {
        Set<Integer> ks = productes.keySet();
        for (int clau : ks) {
            printStockFiltrat(clau, stockMinim);
        }

    }

    public void printStockFiltrat(int codi, int stockMinim) {
        Producte p = productes.get(codi);
        if (p.getStock() >= stockMinim ) {
            System.out.println(p.toString());
        }
    }
    public void showProductes(){
    Set<Integer> ks = productes.keySet();
    TreeSet<Integer> ksOrdenat = 
}

}


