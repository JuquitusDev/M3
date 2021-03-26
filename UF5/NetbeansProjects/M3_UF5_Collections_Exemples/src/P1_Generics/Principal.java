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
public class Principal {

    public static void main(String[] args) {
        Caixa<Integer> ic = new Caixa<>();
        Integer i1 = 1;//new Integer(1);
        ic.set(i1);
        System.out.println(ic.get());

        Caixa<Persona> cp = new Caixa<>();
        Persona p;
        p = new Persona("Pere", "Martinez", "C/Ral 1");
        cp.set(p);
        System.out.println(cp.get().mostra());

        Llibre llibre1 = new Llibre("llibre1", "titoool", 500, "1234567");
        Caixa<Llibre> cll = new Caixa<>();
        cll.set(llibre1);
        System.out.println(cll.get().mostra());

//        CaixaMostrable<I_mostrable> cmp = new CaixaMostrable<>();
//        cmp.set(p);
//        cmp.set(llibre1);
//        System.out.println(cmp.toString());
    }
}
