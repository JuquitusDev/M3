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
public class Document {
    private String titol;

    public Document(String titol) {
        this.titol = titol;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    @Override
    public String toString() {
        return "Document{" + "titol=" + titol + '}';
    }
    
}
