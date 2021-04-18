/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.Serializable;

/**
 *
 * @author marc
 */
public class Propietari implements Serializable {
    protected String dni;
    protected String nom;

    public Propietari(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Propietari{" + "dni=" + dni + ", nom=" + nom + '}';
    }
    
    
}
