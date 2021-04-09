/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Objects;

/**
 *
 * @author Marc
 */
public class Treballador implements Comparable<Treballador>{
    private String nom;
    private String cognoms;
    private double sou;

    public Treballador(String nom, String cognoms, double sou) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Treballador{" + "nom=" + nom + ", cognoms=" + cognoms + ", sou=" + sou + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nom);
        hash = 53 * hash + Objects.hashCode(this.cognoms);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Treballador other = (Treballador) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.cognoms, other.cognoms);
    }

    @Override
    public int compareTo(Treballador o) {
        String nomCognoms = this.nom + this.cognoms;
    return nomCognoms.compareTo(o.nom + o.cognoms);
    }  
}
