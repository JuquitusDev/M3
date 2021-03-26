/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions;

/**
 *
 * @author Marc
 */
import java.util.LinkedList;

/**
 *
 * @author alfredo
 */
public class Cua<Object> {

    protected LinkedList<Object> elementos;

    public Cua() {
        elementos = new LinkedList<>();
    }

    public boolean empty() {
        return elementos.isEmpty();
    }

    public void add(Object e) {
        elementos.addLast(e);
    }

    public Object get() {
        if (!this.empty()) {
            return elementos.removeFirst();
        } else {
            return null;
        }
    }
}