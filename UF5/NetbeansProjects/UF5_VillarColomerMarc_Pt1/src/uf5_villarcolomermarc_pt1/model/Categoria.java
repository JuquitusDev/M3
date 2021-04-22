/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_villarcolomermarc_pt1.model;

import java.io.Serializable;

/**
 *
 * @author Marc
 */
public class Categoria implements Serializable{
   private String nom;

    public Categoria(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nom=" + nom + '}';
    }
   
}
