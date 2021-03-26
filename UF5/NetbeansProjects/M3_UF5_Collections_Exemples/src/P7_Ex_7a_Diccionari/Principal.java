/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P7_Ex_7a_Diccionari;

/**
 *
 * @author alfredo
 */
public class Principal {
    
        public static void main(String[] args) {
        Diccionari dic = new Diccionari();
        dic.afegir("a", "Primera paraula del diccionari i última de la paraula última");
        dic.afegir("Hola", "Salutacio");
        dic.afegir("paraula", "paraula de prova");
        dic.mostrarDiccionari();
        System.out.println("Esborro Hola");
        dic.esborrar("Hola");
        dic.mostrarDiccionari();
    }
}
