/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categoria;
import model.Vaixell;

/**
 *
 * @author alvaro
 */
public class VaixellDAO extends BaseDAO {

    public VaixellDAO() {
        connect();
    }

    public ArrayList<Vaixell> selectVaixells(int eleccio) throws SQLException {
        ArrayList<Vaixell> alv = new ArrayList();
        Vaixell v = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT *,(rating*temps_real)as q FROM vaixells v inner join categories c on c.codi_cat=v.categoria order by v.codi;";
        stmt = conn.prepareStatement(query);
        if (eleccio == 1) {
            query = "SELECT *,(rating*temps_real)as q FROM vaixells v inner join categories c on c.codi_cat=v.categoria order by q;";
            stmt = conn.prepareStatement(query);
        }

        rs = stmt.executeQuery();

        while (rs.next()) {

            v = new Vaixell();
            v.setCodi(rs.getInt("codi"));
            v.setNom(rs.getString("nom"));
            Categoria cat = new Categoria();
            cat.setCodi(rs.getInt("codi_cat"));
            cat.setNom(rs.getString("nom_cat"));
            v.setCategoria(cat);
            v.setRating(rs.getDouble("rating"));
            v.setClub(rs.getString("club"));
            v.setTipusVaixell(rs.getInt("tipus"));
            v.setSenior(false);
            if (rs.getInt("senior") == 1) {
                v.setSenior(true);
            }
            v.setTempsReal(rs.getDouble("temps_real"));
            alv.add(v);

        }
        rs.close();
        stmt.close();

        return alv;
    }

    public void insertaVaixell(Vaixell v) throws SQLException {
        String query = "insert into vaixells values(?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, v.getCodi());
        stmt.setString(2, v.getNom());
        stmt.setInt(3, v.getCategoria().getCodi());
        stmt.setDouble(4, v.getRating());
        stmt.setString(5, v.getClub());
        stmt.setInt(6, v.getTipusVaixell());
        if (v.isSenior()) {
            stmt.setInt(7, 1);
        } else {
            stmt.setInt(7, 0);
        }
        stmt.setDouble(8, v.getTempsReal());
        stmt.executeUpdate();
        stmt.close();
    }
}
