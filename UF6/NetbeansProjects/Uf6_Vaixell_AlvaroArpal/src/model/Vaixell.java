/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alvaro
 */
public class Vaixell {

    int codi;
    String nom;
    Categoria categoria;
    double rating;
    String club;
    int tipusVaixell;
    boolean senior;
    double tempsReal;
    double tempsCompensat = tempsReal * rating;

    public Vaixell() {

    }

    public Vaixell(int codi, String nom, Categoria categoria, double rating, String club, int tipusVaixell, boolean senior, double tempsReal) {
        this.codi = codi;
        this.nom = nom;
        this.categoria = categoria;
        this.rating = rating;
        this.club = club;
        this.tipusVaixell = tipusVaixell;
        this.senior = senior;
        this.tempsReal = tempsReal;

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getTipusVaixell() {
        return tipusVaixell;
    }

    public void setTipusVaixell(int tipusVaixell) {
        this.tipusVaixell = tipusVaixell;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public double getTempsReal() {
        return tempsReal;
    }

    public void setTempsReal(double tempsReal) {
        this.tempsReal = tempsReal;
    }

    public double getTempsCompensat() {
        this.setTempsCompensat();
        return tempsCompensat;
    }

    public void setTempsCompensat() {
        this.tempsCompensat = this.rating * this.tempsReal;
    }

    @Override
    public String toString() {
        return "Vaixell{" + "codi=" + codi + ", nom=" + nom + ", categoria=" + categoria + ", rating=" + rating + ", club=" + club + ", tipusVaixell=" + tipusVaixell + ", senior=" + senior + ", tempsReal=" + tempsReal + ", tempsCompensat=" + tempsCompensat + '}';
    }

}
