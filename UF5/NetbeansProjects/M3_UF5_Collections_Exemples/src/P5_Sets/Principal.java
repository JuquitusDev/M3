/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5_Sets;

import P4_Comparacions.Persona;
import P4_Comparacions.PersonaEdatComparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alfredo
 */
public class Principal {

    public static void main(String[] args) {

        Persona p1 = new Persona("Manel", "1111", "adr", 23);
        Persona p2 = new Persona("Joan", "1111", "adr2", 25);
        Persona p3 = new Persona("Maria", "3333", "adr3", 23);
        Persona p4 = new Persona("Manel", "4444", "adr4", 18);

        // HashSet utilitza hashCode per ubicar l'objecte
        // i equals per veure si és un duplicat.
        // Si equals torna true el hashCode ha de ser el mateix
        HashSet<Persona> hs = new HashSet<>();
        hs.add(p4);
        hs.add(p3);
        hs.add(p1);
        System.out.println(hs.add(p2));        
        System.out.println("-----Llistat HashSet 1111 duplicat");
        for (Persona p : hs) {
            System.out.println(p);
        }

        System.out.println("-----Llistat HashSet amb 3333 esborrat (utilitza equals)");
        Persona aEsborrar = new Persona("", "3333", "", 0);
        hs.remove(aEsborrar);
        for (Persona p : hs) {
            System.out.println(p);
        }

        System.out.println("-----Llistat TreeSet ordre natural (dni)");
        TreeSet<Persona> ts = new TreeSet<>();
        ts.add(p3);
        ts.add(p4);
        ts.add(p1);
        ts.add(p2);
        
        for (Persona p : ts) {
            System.out.println(p);
        }

        System.out.println("-----Listat TreeSet (comparator Edat)");
        PersonaEdatComparator cc = new PersonaEdatComparator();
        
        TreeSet<Persona> tsc = new TreeSet(cc);
        tsc.addAll(ts);
        for (Persona p : tsc) {
            System.out.println(p);
        }
        System.out.println("Modificació enhanced_for");
        try {
            for (Persona p : tsc) {
                if (p.getEdat() == 18) {
                    // Error. No es pot modificar l'estructura 
                    tsc.remove(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Modificació amb iterador");
        Iterator<Persona> it = tsc.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.getEdat() == 18) {
                it.remove();
            }
        }

        for (Persona p : tsc) {
            System.out.println(p);
        }

    }
}
