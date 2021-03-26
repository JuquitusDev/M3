/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_Generics;

/**
 *
 * @author alfredo
 */
public class Caixa<T> {

    T t;

//    public Caixa(T t) {
//        this.t = t;
//    }

    public void set(T e) {
        t = e;
    }
    public T get(){
        return t;
    }
 }
