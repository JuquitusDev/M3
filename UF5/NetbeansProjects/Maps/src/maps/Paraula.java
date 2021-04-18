/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.Objects;

/**
 *
 * @author Juquitus
 */
public class Paraula {
    private String definicio;
    private String idioma;
    private String tipus;

    public String getDefinicio() {
        return definicio;
    }

    public void setDefinicio(String definicio) {
        this.definicio = definicio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Paraula(String definicio, String idioma, String tipus) {
        this.definicio = definicio;
        this.idioma = idioma;
        this.tipus = tipus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.definicio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paraula other = (Paraula) obj;
        if (!Objects.equals(this.definicio, other.definicio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paraula{" + "definicio=" + definicio + ", idioma=" + idioma + ", tipus=" + tipus + '}';
    }
    
}
