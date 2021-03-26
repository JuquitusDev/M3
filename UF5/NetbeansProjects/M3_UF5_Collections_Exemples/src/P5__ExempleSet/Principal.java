/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5__ExempleSet;

/**
 *
 * @author alfredo
 */
public class Principal {

    public static void main(String[] args) {
        Cotxe c1 = new Cotxe("M7", "Ford", 2004);
        Cotxe c2 = new Cotxe("M2", "Reanult", 2004);
        Cotxe c3 = new Cotxe("M3", "BMWF", 2015);
        Cotxe c4 = new Cotxe("M1", "Reanult", 2004);
 
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        Garatge gar = new Garatge("Garatge Pepe");
        gar.afegir(c1);
        gar.afegir(c2);
        gar.afegir(c3);
        gar.afegir(c4);        
        gar.Llista();
        gar.LlistaMatricula();
        gar.LlistaAnyMatricula();
    }
}
