package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Categoria;
import model.Vaixell;
import persist.CategoriaDAO;
import persist.UtilBD;
import persist.VaixellDAO;
import view.gui_vaixells;

/**
 *
 * @author marc
 */
public class Controlador {

    gui_vaixells frm;

    public Controlador() throws SQLException {

           UtilBD.createEstructuraMysql();
        this.frm = new gui_vaixells(this);

    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm.setVisible(true);
            }
        });
    }

    public void iniciaCRUD() throws SQLException {
        Controlador_CRUD ctlcr = new Controlador_CRUD(null);
        ctlcr.run();
    }

    public void iniciaCRUD(Vaixell v) throws SQLException {
        Controlador_CRUD ctlcr = new Controlador_CRUD(v);
        ctlcr.run();
    }

    public TableModel tmCodi(int categoria, int eleccio) throws SQLException {
        DefaultTableModel tmCodi = new DefaultTableModel();

        tmCodi.addColumn("Codi");
        tmCodi.addColumn("Nom");
        tmCodi.addColumn("Categoria");
        tmCodi.addColumn("Rating");
        tmCodi.addColumn("Club");
        tmCodi.addColumn("Tipus");
        tmCodi.addColumn("Senior");
        tmCodi.addColumn("Temps Real");
        tmCodi.addColumn("Temps Compensat");

        VaixellDAO vd = new VaixellDAO();

        ArrayList<Vaixell> arrVaix = vd.selectVaixells(eleccio, categoria);
        for (Vaixell v : arrVaix) {

            Object fila[] = new Object[9];

            fila[0] = v.getCodi();
            fila[1] = v.getNom();
            fila[2] = v.getCategoria().getNom();
            fila[3] = v.getRating();
            fila[4] = v.getClub();
            fila[5] = v.getTipusVaixell();
            fila[6] = v.isSenior();
            fila[7] = v.getTempsReal();
            fila[8] = v.getTempsCompensat();
            tmCodi.addRow(fila);

        }

        return tmCodi;
    }

    public String carregaCategoria(int codi) throws SQLException {
        CategoriaDAO cd = new CategoriaDAO();
        Categoria c = cd.selectCategoria(codi);
        return c.getNom();
    }

    public Vaixell carregaVaixell(int codi) throws SQLException {
        VaixellDAO vd = new VaixellDAO();
        return vd.selectVaixell(codi);
    }

    public void esborraVaixell(int v) {
        VaixellDAO vd = new VaixellDAO();
        try {
            vd.esborraVaixell(v);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
