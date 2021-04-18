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
public class Casa implements Serializable {
    private String carrera;
    private String ciutat;
    private int numInquilins;
    private Propietari propietari;

    public Casa(Propietari propietari, String carrera, String ciutat, int numInquilins) {
        this.propietari = propietari;
        this.carrera = carrera;
        this.ciutat = ciutat;
        this.numInquilins = numInquilins;
    }

    public Propietari getPropietari() {
        return propietari;
    }

    public void setPropietari(Propietari propietari) {
        this.propietari = propietari;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public int getNumInquilins() {
        return numInquilins;
    }

    public void setNumInquilins(int numInquilins) {
        this.numInquilins = numInquilins;
    }

    @Override
    public String toString() {
        return "Casa{" + "propietari=" + propietari + ", carrera=" + carrera + ", ciutat=" + ciutat + ", numInquilins=" + numInquilins + '}';
    }

   
    
}
