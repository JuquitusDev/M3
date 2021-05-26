/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Categoria;
import model.Vaixell;
import persist.CategoriaDAO;
import persist.UtilBD;
import persist.VaixellDAO;
import vista.gui_vaixells;

/**
 *
 * @author alvaro
 */
public class Controlador {

    gui_vaixells frm;

    public Controlador() throws SQLException {

//        UtilBD.createEstructuraMysql();
        this.frm = new gui_vaixells(this);

    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm.setVisible(true);
            }
        });
    }

    public TableModel tmCodigo(int codi, int eleccio) throws SQLException {
        DefaultTableModel tmCodigo = new DefaultTableModel();

        tmCodigo.addColumn("Codi");
        tmCodigo.addColumn("Nom");
        tmCodigo.addColumn("Categoria");
        tmCodigo.addColumn("Rating");
        tmCodigo.addColumn("Club");
        tmCodigo.addColumn("Tipus");
        tmCodigo.addColumn("Senior");
        tmCodigo.addColumn("Temps Real");
        tmCodigo.addColumn("Temps Compensat");

        VaixellDAO vd = new VaixellDAO();

        ArrayList<Vaixell> alv = vd.selectVaixells(eleccio);
        for (Vaixell v : alv) {

            Object fila[] = new Object[9];
            if (v != null && codi == v.getCategoria().getCodi() || v != null && codi == 0) {
                fila[0] = v.getCodi();
                fila[1] = v.getNom();
                fila[2] = v.getCategoria().getNom();
                fila[3] = v.getRating();
                fila[4] = v.getClub();
                fila[5] = v.getTipusVaixell();
                fila[6] = v.isSenior();
                fila[7] = v.getTempsReal();
                fila[8] = v.getTempsCompensat();
                tmCodigo.addRow(fila);
            }

        }

        return tmCodigo;
    }

    public String carregaCategoria(int codi) throws SQLException {
        CategoriaDAO cd = new CategoriaDAO();
        Categoria c = cd.selectCategoria(codi);
        return c.getNom();
    }
}
