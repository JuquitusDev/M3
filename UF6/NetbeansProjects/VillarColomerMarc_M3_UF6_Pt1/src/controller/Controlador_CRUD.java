package controller;

import java.sql.SQLException;
import model.Categoria;
import model.Vaixell;
import persist.CategoriaDAO;
import persist.VaixellDAO;
import view.gui_formulari;

/**
 *
 * @author marc
 */
public class Controlador_CRUD {

    gui_formulari frm;

    public Controlador_CRUD(Vaixell v) throws SQLException {

        this.frm = new gui_formulari(null, this, v);
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm.setVisible(true);
            }
        });
    }

    public String carregaCategoria(int codi) throws SQLException {
        CategoriaDAO cd = new CategoriaDAO();
        Categoria c = cd.selectCategoria(codi);
        return c.getNom();
    }

    public void afegirVaixell(Vaixell v) throws SQLException {
        VaixellDAO vd = new VaixellDAO();
        vd.insertaVaixell(v);
    }

    public void updateVaixell(Vaixell v) throws SQLException {
        VaixellDAO vd = new VaixellDAO();
        vd.modificaVaixell(v);
    }

    public boolean validaCodi(int codi) throws SQLException {
        VaixellDAO vd = new VaixellDAO();
        return vd.verificaCodi(codi);
    }

    public boolean validaLength(String txt) {
        return txt.length() >= 3;
    }

    public boolean validaVacio(String txt) {
        return txt.length() != 0;
    }

    public boolean validaVaixell(Vaixell v) throws SQLException {
        boolean[] validacio = new boolean[7];
        for (int i = 0; i < validacio.length; i++) {
            validacio[i] = true;
        }

        validacio[0] = validaVacio(String.valueOf(v.getCodi()));
        validacio[1] = validaVacio(String.valueOf(v.getNom()));
        validacio[2] = validaVacio(String.valueOf(v.getClub()));
        validacio[3] = validaVacio(String.valueOf(v.getRating()));
        validacio[4] = validaCodi(v.getCodi());
        validacio[5] = validaLength(v.getNom());
        validacio[6] = validaLength(v.getClub());

        for (boolean b : validacio) {
            if (!b) {
                return b;
            }
        }
        return true;
    }
}
