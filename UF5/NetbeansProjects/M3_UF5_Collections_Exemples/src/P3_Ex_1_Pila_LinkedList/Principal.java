/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_Ex_1_Pila_LinkedList;

import P2_Colleccions.Persona;

/**
 *
 * @author alfredo
 */
public class Principal {

    public static void main(String[] args) {
        Pila<Integer> p = new Pila<>();
        Integer i = new Integer(9);
        p.push(7);
        p.push(i);
        p.push(12);
        p.push(21);

        while (!p.empty()) {
            System.out.printf("%d\n", p.pop());
        }

        Pila<Persona> pers = new Pila<>();
        Persona p1 = new Persona("Manel", "4444", "adr", 23);
        Persona p2 = new Persona("Joan", "1111", "adr", 25);
        Persona p3 = new Persona("Maria", "3333", "adr", 23);
        Persona p4 = new Persona("Manel", "4444", "adr", 18);

        pers.push(p1);
        pers.push(p2);
        pers.push(p3);
        pers.push(p4);

        while (!pers.empty()) {
            System.out.println(pers.pop().mostra());
        }

    }
}
