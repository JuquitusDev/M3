/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf6juny;

/**
 *
 * @author Juquitus
 */
public class Immoble {
   protected int codi;
   protected String descripcio;
   protected String poblacio;
   protected double preu;
   protected int metres;

    public Immoble() {
    }

    public Immoble(int codi, String descripcio, String poblacio, double preu, int metres) {
        this.codi = codi;
        this.descripcio = descripcio;
        this.poblacio = poblacio;
        this.preu = preu;
        this.metres = metres;
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

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getMetres() {
        return metres;
    }

    public void setMetres(int metres) {
        this.metres = metres;
    }

    @Override
    public String toString() {
        return "Immoble{" + "codi=" + codi + ", descripcio=" + descripcio + ", poblacio=" + poblacio + ", preu=" + preu + ", metres=" + metres + '}';
    }

  
}