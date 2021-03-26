/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4_Comparacions;

import java.util.Objects;

/**
 *
 * @author 
 */
public class Persona implements Comparable {

    /**
     * nom del treballador
     */
    protected String nom;
    /**
     * dni del treballador
     */
    protected String dni;
    /**
     * adreca del treballador
     */
    protected String adreca;
    protected int edat;

    public Persona(String nom, String dni, String adreca, int edad) {
        this.nom = nom;
        this.dni = dni;
        this.adreca = adreca;
        this.edat = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edad) {
        this.edat = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", dni=" + dni + ", adreca=" + adreca + ", edat=" + edat + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Persona) {
            Persona p = (Persona) o;
            return this.dni.equals(p.getDni());
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Persona) {
            Persona p = (Persona) o;
            return this.dni.compareTo(p.dni);
        } else {
            return 1;
        }
   }

 // Si equals==true  ha de retornar el mateix code    
//    @Override
//    public int hashCode() {
//       
//        return dni.hashCode();
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.dni);
        return hash;
    }
    
}
