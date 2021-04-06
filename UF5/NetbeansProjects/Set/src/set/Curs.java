/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author marcv
 */
public class Curs {
     private Set<Alumne> alumnes = new HashSet<>();
     private String nom;

    public Curs(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
        
    
    public boolean afegir(Alumne a) {
        return alumnes.add(a);
    }
    public boolean esborrar (String dni){
        Alumne a = new Alumne (dni, "", 0);
        return alumnes.remove(a);
    }

    public void Llista() {
        System.out.println("Curs Nom: " + this.nom);
        for (Alumne a : alumnes) {
            System.out.println(a.toString());
        }
    }
    
   public void mostrarAlumnesOrdenats()  {
       Set<Alumne> treeAlumnes = new TreeSet<>();
       treeAlumnes.addAll(alumnes);
       for (Alumne al : treeAlumnes){
           System.out.println(al);
       }
   }
   
}
