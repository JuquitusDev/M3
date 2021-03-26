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
public class Pila<Object> {

    private LinkedList<Object> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }

    public boolean empty() {
        return elementos.isEmpty();
    }

    public void push(Object e) {
        elementos.addLast(e);
    }

    public Object pop() {
        if (!this.empty()) {
            return elementos.removeLast();
        } else {
            return null;
        }
    }
}