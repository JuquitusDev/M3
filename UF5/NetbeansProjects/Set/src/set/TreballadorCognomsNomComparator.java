/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Comparator;

/**
 *
 * @author Marc
 */
public class TreballadorCognomsNomComparator implements Comparator<Treballador> {

    @Override
    public int compare(Treballador o1, Treballador o2) {
        int r;
        if (o1.equals(o2)) {
            r = 0;
        } else {
            r = o1.getCognoms().compareTo(o2.getCognoms());
            if (r == 0) {
                r = o1.getNom().compareTo(o2.getNom());
            }
        }
        return r;
    }
}
