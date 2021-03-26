/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P6_Maps;

import java.util.Comparator;

/**
 *
 * @author alfredo
 */
public class StringComparatorDesc implements Comparator<String> {

    @Override
    public int compare(String key1, String key2) {
        return -key1.compareToIgnoreCase(key2);
    }

}
