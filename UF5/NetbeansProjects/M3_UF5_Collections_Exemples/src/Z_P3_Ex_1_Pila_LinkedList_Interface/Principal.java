/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_P3_Ex_1_Pila_LinkedList_Interface;

/**
 *
 * @author alfredo
 */
public class Principal {

    public static void main(String[] args) {
        Pila<Integer> p = new Pila<>();
        Integer i = new Integer(9);
        p.push(7);
        p.push(i);
        p.push(12);
        p.push(21);
        
        while(!p.empty()){
            System.out.printf("%d ", p.pop());
        }
    }
}
