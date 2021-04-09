/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Marc
 */
public class Empresa {

    Set<Treballador> treballadors = new TreeSet<>();
    private String nom;

    public Empresa(String nom) {
        this.nom = nom;
    }

    public Set<Treballador> getTreballadors() {
        return treballadors;
    }

    public void setTreballadors(Set<Treballador> treballadors) {
        this.treballadors = treballadors;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

 public boolean afegir(Treballador a) {
        return treballadors.add(a);
    }

    public void Llista() {
        System.out.println("Empresa Nom: " + this.nom);
        for (Treballador a : treballadors) {
            System.out.println(a.toString());
        }
    }
    
   public void mostrarTreballadorsOrdenats()  {
     TreballadorCognomsNomComparator cmp = new TreballadorCognomsNomComparator();
         Set<Treballador> treballadorsOrdenats = new TreeSet<>(cmp);
         treballadorsOrdenats.addAll(treballadors);

        System.out.println("Empresa Nom: " + this.nom);
        for (Treballador c : treballadorsOrdenats) {
            System.out.println(c.toString());
        }

   }
}
