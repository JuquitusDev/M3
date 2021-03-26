/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_Colleccions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alfredo
 */
public class Collection_exemple {

    public static void main(String[] args) {
        Persona p1 = new Persona("Manel", "4444", "adr", 23);
        Persona p2 = new Persona("Joan", "1111", "adr", 25);
        Persona p3 = new Persona("Maria", "3333", "adr", 23);
        Persona p4 = new Persona("Manel", "4444", "adr", 18);

        List<Persona> ap = new ArrayList<>();
        // List<Persona> ap = new LinkedList<>();
        //Set<Persona> ap = new HashSet<>();
        // Set<Persona> ap = new TreeSet<>();

        ap.add(p1);
        ap.add(p2);
        System.out.println(ap.add(p3));
        System.out.println(ap.add(p4));
        ap.add(new Persona("Manel2", "2222", "adr", 18));
        ap.add(new Persona("Manel3", "7777", "adr", 18));
        ap.add(new Persona("Manel4", "2", "adr", 18));
        ap.add(new Persona("Manel5", "5555", "adr", 18));
//      ap.add(0, new Persona("Manel4", "2", "adr", 18));
//      ap.add(1, new Persona("Manel5", "5555", "adr", 18));

        for (Persona p : ap) {
            System.out.println(p.mostra());
//            if (p.getDni().equals("1111")) {
//                ap.remove(p);
//            }
        }
        System.out.println();
        Iterator<Persona> it = ap.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.getDni().equals("1111")) {
                it.remove();
            }
        }
        for (Persona p : ap) {
            System.out.println(p.mostra());
        }
        System.out.println();

        for (Persona p : ap) {
            if (p.getDni().equals("3333")) {
                p.setDni("0000");
                //ap.remove(p);

            }
        }

        for (Persona p : ap) {
            System.out.println(p.mostra());
        }

    }
}
