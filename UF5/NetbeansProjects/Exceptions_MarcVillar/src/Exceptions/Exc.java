/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

public class Exc extends Exception {

    private Integer valor;

    public Exc(int i) {
        valor = new Integer(i);
    }

    @Override
    public String toString() {
        return "ERROR: El divisor es: "+ this.valor;
    }
}
