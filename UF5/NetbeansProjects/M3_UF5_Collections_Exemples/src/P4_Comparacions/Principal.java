/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4_Comparacions;

import java.util.Comparator;
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
        Persona p4 = new Persona("Manel", "4444", "adr", 18);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("Equals");
        System.out.println("p1, p2:" + p1.equals(p2));
        System.out.println("p1, p3:" + p1.equals(p3));
        System.out.println("p1, p4:" + p1.equals(p4));

        System.out.println("compareTo");
        System.out.println("p1, p2:" + p1.compareTo(p2));
        System.out.println("p1, p3:" + p1.compareTo(p3));
        System.out.println("p1, p4:" + p1.compareTo(p4));

        System.out.println("compare(Edat+compareTo)");
        PersonaEdatComparator cc = new PersonaEdatComparator();
        System.out.println("p1, p2:" + cc.compare(p1, p2));
        System.out.println("p1, p3:" + cc.compare(p1, p3));
        System.out.println("p1, p4:" + cc.compare(p1, p4));

        System.out.println("HashCode");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        
        System.out.println("hashCode 1111");
        System.out.println(new Integer(1111).toString().hashCode());
        System.out.println(new Integer(1111).hashCode());
        System.out.println(new Integer("1111").hashCode());
    }
}
