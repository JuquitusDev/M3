/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_ex2;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Pelicula {

    int peli_id;
    String titulo;
    Date fechaEstreno;
    int duracion;
    ArrayList<Director> directores = new ArrayList();

    public Pelicula() {

    }

    public Pelicula(int peli_id, String titulo, Date fechaEstreno, int duracion) {
        this.peli_id = peli_id;
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
    }

    public void addDirector(Director d) {
        directores.add(d);
    }

    public int getPeli_id() {
        return peli_id;
    }

    public void setPeli_id(int peli_id) {
        this.peli_id = peli_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Director> directores) {
        this.directores = directores;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "peli_id=" + peli_id + ", titulo=" + titulo + ", fechaEstreno=" + fechaEstreno + ", duracion=" + duracion + ", directores=" + directores + '}';
    }

}
