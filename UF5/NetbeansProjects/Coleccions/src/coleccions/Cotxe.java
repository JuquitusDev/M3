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
public class Cotxe {
    private String matricula;

    public Cotxe(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Cotxe{" + "matricula=" + matricula + '}';
    }
    
}
