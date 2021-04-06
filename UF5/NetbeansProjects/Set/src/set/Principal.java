/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

/**
 *
 * @author marcv
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
 Curs c1 = new Curs ("1rDAW");
 Alumne a1 = new Alumne("2505D", "Marc", 9);
 Alumne a2 = new Alumne ("2503R", "Xavi", 8);
 Alumne a3 = new Alumne ("2503R", "Nom3", 7);
 Alumne a4 = new Alumne ("1254K", "Marc", 9);
 Alumne a5 = new Alumne ("2450X", "Perma", 7);
        System.out.println(c1.afegir(a1));
        System.out.println(c1.afegir(a2));
        System.out.println(c1.afegir(a3));
        System.out.println(c1.afegir(a4));
        System.out.println(c1.afegir(a5));
        System.out.println("\nLlista no ordenada\n");
 c1.Llista();
         System.out.println("\nLlista ordenada\n");
 c1.mostrarAlumnesOrdenats();
}
}