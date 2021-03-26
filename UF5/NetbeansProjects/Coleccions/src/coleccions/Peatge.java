/*
Suposa que volem crear un programa per simular un peatge d'una autopista. Suposem que
tenim 5 "caixes" per pagar el peatge. Un cotxe quan arriba al peatge anirà a aquella caixa que hi
ha menys cotxes. Si diferents caixes tenen aquest mínim número de cotxes anirà indistintament
a qualsevol d'aquestes. Crea una classe Peatge amb la col·lecció adient per simular aquesta
situació. Fes que aquesta classe a parts dels atributs i mètodes habituals tingui un mètode push i
un altre pop.
 */
package coleccions;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Marc
 */
public class Peatge {
   private ArrayList<Caixa> caixes;
    
   public Peatge() {
       for (int i = 0; i < 5; i++) {
           caixes.add(new Caixa("caixa" + (i + 1)));
       }
    }
       
   public void entraCotxe (Cotxe c) {
       int indexCaixa = 0;
       int i = 0;
       int j = 0;
       int mesPetit = 0;
         for (Caixa ca: caixes) {
                if(ca.size() < mesPetit){
               mesPetit = ca.size();
               indexCaixa = i;
           }
             
             i++;
       }
         for (Caixa ca: caixes) {
                if(j == indexCaixa){
               ca.add(c);
           }
             j++;
       }
    }

    public Cotxe surtCotxe () {
        int i = 0;
        Random rnd = new Random(5);
       for (Caixa ca: caixes) {
         if (!ca.empty()) {
            return this elementos.removeFirst();
        } else {
            return null;
        }  
         i++;
       }
        
    }
   
   
}
