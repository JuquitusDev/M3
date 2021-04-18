/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

/**
 *
 * @author Juquitus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    //EX 7 ----------------------------------------
    public static void main(String[] args) {
        Diccionari dic = new Diccionari();
        Paraula hola = new Paraula("saludo", "ca", "adv");
        Paraula jenga = new Paraula("joc", "ca", "sus");
        Paraula paraula = new Paraula("conjunt lletres", "ca", "sus");
        Paraula vale = new Paraula("ok", "ca", "adv");
        Paraula sorra = new Paraula("terra", "ca", "sus");
        dic.afegir("salut", hola);
        dic.afegir("jogo", jenga);
        dic.afegir("word", paraula);
        dic.afegir("dacord", vale);
        dic.afegir("sand", sorra);
        System.out.println("Pre esborrat");
        dic.mostrarDiccionari();
        dic.esborrar("jogo");
        System.out.println("Post esborrat");
        dic.mostrarDiccionari();

        System.out.println("\n\n\n\n");

        //EX 8 ----------------------------------------
        Agenda ag = new Agenda();
        Contacte c1 = new Contacte("marc", "carretera1", "vilanova", "666666666");
        Contacte c2 = new Contacte("billy", "carretera2", "roca", "66452");
        Contacte c3 = new Contacte("alfredo", "carretera3", "vilanova", "4564564");
        Contacte c4 = new Contacte("francesc", "carretera4", "montornes", "5166");
        Contacte c5 = new Contacte("eduard", "carretera5", "granollers", "232148");
        ag.afegir(c1);
        ag.afegir(c2);
        ag.afegir(c3);
        ag.afegir(c4);
        ag.afegir(c5);
        System.out.println("Llista nom ordenat");
        ag.llistaOrdenatNom();
        System.out.println("\n\n");
        ag.esborrar("marc");
        System.out.println("Marc esborrat, print llista");
        ag.llistaOrdenatNom();
        System.out.println("\n");
        System.out.println("Mostrar per nom de contacte 'billy' ");
        ag.mostrarDadesContacte("billy");
        System.out.println("Mostrar per lletra de nom 'f'");
        ag.mostrarContactesLletraNom('f');
        System.out.println("Mostrar per string coincident 'vil' ");
        ag.mostrarContactesPoblacio("vil");

    }

}
