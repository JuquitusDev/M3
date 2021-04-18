/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.io.Serializable;

/**
 *
 * @author jordi
 */
public class Nota implements Serializable {
    protected double puntuacio;
    protected String modul;

    public Nota(double puntuacio, String modul) {
        this.puntuacio = puntuacio;
        this.modul = modul;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    @Override
    public String toString() {
        return "Nota{" + "puntuacio=" + puntuacio + ", modul=" + modul + '}';
    }
    
    
}
