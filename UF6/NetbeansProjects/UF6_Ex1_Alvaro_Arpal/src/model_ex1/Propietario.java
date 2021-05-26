/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_ex1;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Propietario {

    String dni;
    String nombre;
    int edad;
    ArrayList<Coche> coches = new ArrayList();

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void addCoche(Coche c) {
        coches.add(c);
    }

    public Propietario() {

    }

    public Propietario(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Propietario{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", coches=" + coches + '}';
    }

}
