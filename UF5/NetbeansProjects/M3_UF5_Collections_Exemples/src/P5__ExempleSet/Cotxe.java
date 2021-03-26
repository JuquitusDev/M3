/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5__ExempleSet;

import java.util.Objects;

/**
 *
 * @author alfredo
 */
public class Cotxe implements Comparable<Cotxe>{
    private String matricula;
    private String Marca;
    private int any;

    public Cotxe(String matricula, String Marca, int any) {
        this.matricula = matricula;
        this.Marca = Marca;
        this.any = any;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.matricula);
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
        final Cotxe other = (Cotxe) obj;
//        if (!Objects.equals(this.matricula, other.matricula)) {
//            return false;
//        }
        if (!this.matricula.equals(other.matricula)){
            return false;
        }
        return true;
    }    

    @Override
    public String toString() {
        return "Cotxe{" + "matricula=" + matricula + ", Marca=" + Marca + ", any=" + any + '}';
    }

    @Override
    public int compareTo(Cotxe o) {
        return (this.matricula.compareTo(o.matricula));
    }
    
}
