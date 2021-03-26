/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_Maps;

import P4_Comparacions.Persona;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author alfredo
 */
public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona("Manel", "1111", "adr", 23);
        Persona p2 = new Persona("Joan", "1111", "adr", 25);
        Persona p3 = new Persona("Maria", "3333", "adr", 23);
        Persona p4 = new Persona("Manel", "444", "adr", 18);

        Map<String, Persona> hmPer = new HashMap<>();
        hmPer.put(p1.getDni(), p1);
        hmPer.put(p2.getDni(), p2);
        hmPer.put(p3.getDni(), p3);
        hmPer.put(p4.getDni(), p4);

        System.out.println("Map Enhanced_for per keys");
        Set<String> ks = hmPer.keySet();
        for (String key : ks) {
            Persona p = hmPer.get(key);
            System.out.println(p.toString());
        }

        System.out.println();
        System.out.println("Mostra el 3333 per Clau");
        System.out.println(hmPer.get("3333").toString());
        System.out.println("Esborro el 1111 per Clau");
        hmPer.remove("1111");
        for (String key : ks) {
            Persona p = hmPer.get(key);
            System.out.println(p.toString());
        }
        System.out.println();

        System.out.println("Iterator remove 444");
        Iterator<String> it = ks.iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (hmPer.get(key).getDni().equals("444")) {
                it.remove();
            }
        }

        System.out.println("Enanced for per keys");
        for (String key : ks) {
            System.out.println(hmPer.get(key).toString());
        }
        System.out.println();

        System.out.println("Enhanced for per Values");
        Collection<Persona> cv = hmPer.values();
        for (Persona v : cv) {
            System.out.println(v.toString());
        }

        System.out.println("\nActualitzo 3333 a 0000");
        Persona p = hmPer.get("3333");
        if (p != null) {
            p.setDni("0000");
        }

        for (String key : ks) {
            System.out.println(hmPer.get(key).toString());
        }

        // TreeMap com el hashMap amb ordre
        // Necessita el compareTo
        Map<String, Persona> tmPer = new TreeMap<>();
        tmPer.put(p1.getDni(), p1);
        tmPer.put(p2.getDni(), p2);
        tmPer.put(p3.getDni(), p3);
        tmPer.put(p4.getDni(), p4);

        System.out.println("\nTreeMap ordre natural");
        ks = tmPer.keySet();
        for (String key : ks) {
            System.out.println(tmPer.get(key).toString());
        }

        System.out.println("\nTreeMap ordre desc amb Comparator");
        StringComparatorDesc cc = new StringComparatorDesc();
        Map<String, Persona> tmPerCp = new TreeMap<>(cc);
        tmPerCp.putAll(tmPer);

        ks = tmPerCp.keySet();
        for (String key : ks) {
            System.out.println(tmPerCp.get(key).toString());
        }
    }
}
