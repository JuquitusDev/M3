/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_Colleccions;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author alfredo
 * @param <T>
 */
public class Sac_Col<T> implements Collection<T> {

    private int quant;
    private Object[] elements;

    public Sac_Col(int max) {
        this.elements = new Object[max];
    }

    @Override
    public int size() {
        return quant;
    }

    @Override
    public boolean isEmpty() {
        return quant == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < quant; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T e) {
        if (quant < elements.length) {
            elements[quant] = e;
            quant++;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        int max = this.elements.length;
        this.elements = new Object[max];
        quant = 0;
    }

    private class sac_iterator<T> implements Iterator<T> {

        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < quant;
        }

        @Override
        public T next() {
            T e = null;
            if (pos < quant) {
                e = (T) elements[pos];
                pos++;
            }
            return e;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new sac_iterator();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> sac = new Sac_Col(10);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            sac.add(rnd.nextInt(100));
        }

        for (Integer x : sac) {
            int valor = x;
            System.out.print(valor + " ");
        }
        System.out.println();
        //sac.clear();
        //System.out.println(sac.size());
        for (int i = 0; i < 10; i++) {
            int n = rnd.nextInt(100);
            System.out.println(n + " " + sac.contains(n));
        }

    }

}
