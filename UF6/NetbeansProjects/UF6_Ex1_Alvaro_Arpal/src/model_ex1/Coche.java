/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_ex1;

/**
 *
 * @author alvaro
 */
public class Coche {

    String matricula;
    String marca;
    int precio;
    String dni;

    public Coche() {

    }

    public Coche(String matricula, String marca, int precio, String dni) {
        this.matricula = matricula;
        this.marca = marca;
        this.precio = precio;
        this.dni = dni;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", dni=" + dni + '}';
    }

}
