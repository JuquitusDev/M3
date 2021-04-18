/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.Objects;

/**
 *
 * @author Juquitus
 */
public class Contacte implements Comparable<Contacte>{
    private String nom;
    private String adreça;
    private String poblacio;
    private String telefon;

    public Contacte(String nom, String adreça, String poblacio, String telefon) {
        this.nom = nom;
        this.adreça = adreça;
        this.poblacio = poblacio;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Contacte{" + "nom=" + nom + ", adreça=" + adreça + ", poblacio=" + poblacio + ", telefon=" + telefon + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nom);
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
        final Contacte other = (Contacte) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Contacte t) {
  return (this.nom.compareTo(t.nom));
    }
    
    
}
