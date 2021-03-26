package P7_Ex_7a_Diccionari;


import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alfredo
 */
public class Diccionari {

    private TreeMap<String, String> llista;

    public Diccionari() {
        llista = new TreeMap<String, String>();
    }

    public void afegir(String paraula, String significat) {
        llista.put(paraula.toLowerCase(), significat);
    }

    public void esborrar(String paraula) {
        llista.remove(paraula.toLowerCase());
    }

    public String cercarSignificat(String paraula) {
        return llista.get(paraula.toLowerCase());
    }

    public String showParaula(String paraula) {
        return "paraula:" + paraula + " ---> " + cercarSignificat(paraula);
    }

    public void mostrarDiccionari() {
        System.out.println("Amb iterador");
        Iterator<String> it;
        Set<String> ks = llista.keySet();
//        it = ks.iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            System.out.println(showParaula(key));
//        }
        System.out.println("Amb Enahanced For");
        for (String clau : ks) {
            System.out.println(showParaula(clau));
        }
    }

}
