package P1_Generics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author super
 */
public class Llibre implements I_mostrable{
    protected String autor;
    private String titol;
    private int numPag;
    private String ISBN;
    private boolean prestat;

    public Llibre(String autor, String titol, int numPag, String ISBN) {
        this.autor = autor;
        this.titol = titol;
        this.numPag = numPag;
        this.ISBN = ISBN;
        this.prestat = false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isPrestat() {
        return prestat;
    }

    public void setPrestat(boolean prestat) {
        this.prestat = prestat;
    }

    @Override
    public String toString() {
        return "Llibre{" + "autor=" + autor + ", titol=" + titol + ", numPag=" + numPag + ", ISBN=" + ISBN + ", prestat=" + prestat + '}';
    }

    @Override
    public String mostra() {
        return this.toString();
    }
    
    
}
