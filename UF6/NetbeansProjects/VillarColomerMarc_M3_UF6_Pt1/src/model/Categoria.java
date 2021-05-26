package model;

/**
 *
 * @author marc
 */
public class Categoria {

    int codi;
    String nom;

    public Categoria() {
    }

    public Categoria(int codi, String nom) {
        this.codi = codi;
        this.nom = nom;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codi=" + codi + ", nom=" + nom + '}';
    }

}
