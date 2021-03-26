/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5__ExempleSet;

import P4_Comparacions.*;
import java.util.Comparator;

/**
 *
 * @author alfredo
 */
public class CotxeAnyComparator implements Comparator<Cotxe> {

    @Override
    public int compare(Cotxe o1, Cotxe o2) {

        int r = o1.getAny() - o2.getAny();
        if (r == 0) {
            r = o1.getMarca().compareTo(o2.getMarca());
            if (r == 0) {
                r = o1.compareTo(o2);
            }
        }

        return r;
    }

}
