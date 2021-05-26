/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_ex2;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Director {

    int id;
    String nombre;
    ArrayList<Pelicula> peliculas = new ArrayList();

    public Director() {

    }

    public Director(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Director{" + "id=" + id + ", nombre=" + nombre + ", peliculas=" + peliculas + '}';
    }

}
