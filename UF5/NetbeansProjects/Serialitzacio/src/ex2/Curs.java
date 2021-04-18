/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Curs implements Serializable {
    protected String nom;
    protected ArrayList<Alumne>  llisAlumnes = new ArrayList<Alumne>();

    public Curs(String nom) {
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
        return "Curs{" + "nom=" + nom + '}';
    }
    
    
}
