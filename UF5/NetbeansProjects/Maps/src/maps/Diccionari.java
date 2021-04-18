/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Juquitus
 */
public class Diccionari {

    private HashMap<String, Paraula> llista;

    public Diccionari() {
        llista = new HashMap<String, Paraula>();
    }

    public void afegir(String clau, Paraula p) {
        llista.put(clau.toLowerCase(), p);
    }

    public void esborrar(String paraula) {
        llista.remove(paraula.toLowerCase());
    }

    public String cercarSignificat(String paraula) {
        Paraula p = llista.get(paraula.toLowerCase());
        return p.getDefinicio().toLowerCase();
    }

    public String showParaula(String paraula) {
        return "paraula:" + paraula + " ---> " + cercarSignificat(paraula);
    }

    public void mostrarDiccionari() {
        Set<String> ks = llista.keySet();
        for (String clau : ks) {
            System.out.println(showParaula(clau));
        }
    }
}
