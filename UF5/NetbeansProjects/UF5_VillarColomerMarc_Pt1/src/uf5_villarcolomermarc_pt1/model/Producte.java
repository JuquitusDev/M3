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
public class Producte implements Serializable{
    protected int codi;
    protected String descripcio;
    protected double preu;
    protected String ubicacio;
    protected Categoria categoria;
    protected String tipus;
    protected boolean oferta;
    protected int stock;
    protected final double importTotal = stock * preu;

        public Producte(int codi, String descripcio, double preu, String ubicacio, Categoria categoria, String tipus, boolean oferta, int stock) {
        this.codi = codi;
        this.descripcio = descripcio;
        this.preu = preu;
        this.ubicacio = ubicacio;
        this.categoria = categoria;
        this.tipus = tipus;
        this.oferta = oferta;
        this.stock = stock;
    }

        
    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producte{" + "codi=" + codi + ", descripcio=" + descripcio + ", preu=" + preu + ", ubicacio=" + ubicacio + ", categoria=" + categoria + ", tipus=" + tipus + ", oferta=" + oferta + ", stock=" + stock + ", importTotal=" + importTotal + '}';
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.codi;
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
        final Producte other = (Producte) obj;
        if (this.codi != other.codi) {
            return false;
        }
        return true;
        
        
    }







}
