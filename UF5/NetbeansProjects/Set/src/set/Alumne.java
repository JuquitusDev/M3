/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Objects;

/**
 *
 * @author marcv
 */
public class Alumne implements Comparable<Alumne> {
    private String dni;
    private String nom;
    private int nota;

    public Alumne(String dni, String nom, int nota) {
        this.dni = dni;
        this.nom = nom;
        this.nota = nota;
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumne{" + "dni=" + dni + ", nom=" + nom + ", nota=" + nota + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.dni);
        hash = 17 * hash + Objects.hashCode(this.nom);
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
        final Alumne other = (Alumne) obj;
        if (!this.dni.equals(other.dni) && !this.nom.equals(other.nom)) {
            return false;
        }
        return true;
    }
        @Override
    public int compareTo(Alumne a) {
        return (this.dni.compareTo(a.dni));
    }
    
    
}
