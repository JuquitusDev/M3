/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions;

import java.util.LinkedList;

/**
 *
 * @author Marc
 */
public class Caixa{
       protected LinkedList<Cotxe> cotxes;
       private String titol;
       
    public Caixa(String titol) {
        titol = this.titol;
        cotxes = new LinkedList<>();
    }

    public boolean empty() {
        return cotxes.isEmpty();
    }

    public void add(Cotxe e) {
        cotxes.addLast(e);
    }

    public Cotxe get() {
        if (!this.empty()) {
            return cotxes.removeFirst();
        } else {
            return null;
        }
    }
    public int size() {
       return cotxes.size();
    }
}
