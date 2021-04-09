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

        Curs c1 = new Curs("1rDAW");
        Alumne a1 = new Alumne("2505D", "Marc", 9);
        Alumne a2 = new Alumne("2503R", "Xavi", 8);
        Alumne a3 = new Alumne("2503R", "Nom3", 7);
        Alumne a4 = new Alumne("1254K", "Marc", 9);
        Alumne a5 = new Alumne("2450X", "Perma", 7);
        System.out.println(c1.afegir(a1));
        System.out.println(c1.afegir(a2));
        System.out.println(c1.afegir(a3));
        System.out.println(c1.afegir(a4));
        System.out.println(c1.afegir(a5));
        System.out.println("\nLlista no ordenada\n");
        c1.Llista();

        System.out.println("Borrem el primer");
        c1.esborrar("2505D");

        System.out.println("\nLlista ordenada\n");
        c1.mostrarAlumnesOrdenats();
        System.out.println("\n\n\n\n");
        // Exercici 6 ------------------------------------

        Empresa e1 = new Empresa("Vallbona");
        Treballador t1 = new Treballador("Marc", "Villar", 900);
        Treballador t2 = new Treballador("Xavi", "Villar", 800);
        Treballador t3 = new Treballador("Nom3", "Villar", 700);
        Treballador t4 = new Treballador("Marc", "Villar", 900);
        Treballador t5 = new Treballador("Peter", "Anguila", 700);
         Treballador t6 = new Treballador("Jimba", "Jumba", 700);
        System.out.println(e1.afegir(t1));
        System.out.println(e1.afegir(t2));
        System.out.println(e1.afegir(t3));
        System.out.println(e1.afegir(t4));
        System.out.println(e1.afegir(t5));
         System.out.println(e1.afegir(t6));
        System.out.println("\nLlista no ordenada\n");
        e1.Llista();
        System.out.println("\nLlista ordenada\n");
        e1.mostrarTreballadorsOrdenats();
        
    }
}
