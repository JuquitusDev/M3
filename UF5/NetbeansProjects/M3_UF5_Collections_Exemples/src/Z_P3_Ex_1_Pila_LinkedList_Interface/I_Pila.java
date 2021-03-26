/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_P3_Ex_1_Pila_LinkedList_Interface;

/**
 *
 * @author alfredo
 * @param <T>
 */
public interface I_Pila <T> {
    public boolean empty();
    public void push (T e);
    public T pop();   
}
