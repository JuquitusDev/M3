/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple_fitxer_objectes;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {      
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getDni(){
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }
    
    
}
