/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4_Comparacions;

import java.util.Comparator;

/**
 *
 * @author alfredo
 */
public class PersonaEdatComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int r;
        if (o1.equals(o2)) {
            r = 0;
        } else {
            r = o1.getEdat() - o2.getEdat();
            if (r == 0) {
                r = o1.compareTo(o2);
            }
        }
        return r;
    }

}
