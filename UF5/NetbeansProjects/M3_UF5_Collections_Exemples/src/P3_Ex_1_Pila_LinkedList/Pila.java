/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_Ex_1_Pila_LinkedList;

import java.util.LinkedList;

/**
 *
 * @author alfredo
 */
public class Pila<T> {

    private LinkedList<T> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }

    public boolean empty() {
        return elementos.isEmpty();
    }

    public void push(T e) {
        elementos.addLast(e);
    }

    public T pop() {
        if (!this.empty()) {
            return elementos.removeLast();
        } else {
            return null;
        }
    }
}
