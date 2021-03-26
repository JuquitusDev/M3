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
        caixes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            caixes.add(new Caixa("caixa" + (i + 1)));
        }
    }

    public void entraCotxe(Cotxe c) {
        int indexCaixa = 0;
        int i = 0;
        int j = 0;
        int mesPetit = 0;
        for (Caixa ca : caixes) {
            if (ca.size() == 0) {
                indexCaixa = i;
                break;
            } else {
                if(i == 0){
                mesPetit = ca.size();
            }
                if (ca.size() < mesPetit) {
                    mesPetit = ca.size();
                    indexCaixa = i;
                }
            }

            i++;
        }
        for (Caixa ca : caixes) {
            if (j == indexCaixa) {
                ca.add(c);
                System.out.println("El cotxe amb matricula: " + c.getMatricula() + " ha entrat a la caixa " + (indexCaixa + 1));
                mostrarCaixes();
            }
            j++;
        }
    }

    public Cotxe surtCotxe() {
        comprovarEmptyPeatge();
        Cotxe cotxe = null;
        do {
            int i = 0;
            cotxe = null;
            int rnd = new Random().nextInt(5);
            for (Caixa ca : caixes) {
                if (!ca.empty() && i == rnd) {
                    cotxe = ca.get();
                    System.out.println("El cotxe amb matricula: " + cotxe.getMatricula() + " ha sortit de la caixa " + (i + 1));
                    mostrarCaixes();
                    return cotxe;
                }
                i++;
            }
        } while (!comprovarEmptyPeatge());
        
            System.out.println("No hi han més cotxes");   
        return null;
    }
    

    public void mostrarCaixes() {
        int i = 0;
        for (Caixa ca : caixes) {
            System.out.println("Caixa " + (i + 1) + "(" + ca.size() + ")");
            i++;
        }
    }

    public boolean comprovarEmptyPeatge() {
        int i = 0;
        boolean empty = true;
        for (Caixa ca : caixes) {
            if (ca.size() != 0) {
                empty = false;
            }
            i++;
        }
        return empty;
    }
}
