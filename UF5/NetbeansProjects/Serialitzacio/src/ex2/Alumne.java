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
public class Alumne implements Serializable {
    
    protected String nom;
    protected int edat;
    ArrayList<Nota>  llisNota = new ArrayList<Nota>();
    
    public Alumne(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
      
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Alumne{" + "nom=" + nom + ", edat=" + edat + '}';
    }
    
    
    
}
