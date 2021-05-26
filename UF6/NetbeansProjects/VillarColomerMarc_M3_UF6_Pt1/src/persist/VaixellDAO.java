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
 * @author marc
 */
public class VaixellDAO extends BaseDAO {

    public VaixellDAO() {
        connect();
    }

    public ArrayList<Vaixell> selectVaixells(int eleccio, int cat) throws SQLException {
        ArrayList<Vaixell> arrVaix = new ArrayList();
        Vaixell v = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT *,(rating*temps_real)as q FROM vaixells v inner join categories c on c.codi_cat=v.categoria ";
        if (cat > 0) {
            query += " where  v.categoria=" + cat;
        }
        if (eleccio == 1) {
            query += " order by q;";
        } else {
            query += " order by v.codi;";
        }

        stmt = conn.prepareStatement(query);
        rs = stmt.executeQuery();

        while (rs.next()) {

            v = new Vaixell();
            v.setCodi(rs.getInt("codi"));
            v.setNom(rs.getString("nom"));
            Categoria cat1 = new Categoria();
            cat1.setCodi(rs.getInt("codi_cat"));
            cat1.setNom(rs.getString("nom_cat"));
            v.setCategoria(cat1);
            v.setRating(rs.getDouble("rating"));
            v.setClub(rs.getString("club"));
            v.setTipusVaixell(rs.getString("tipus"));
            v.setSenior(false);
            if (rs.getInt("senior") == 1) {
                v.setSenior(true);
            }
            v.setTempsReal(rs.getDouble("temps_real"));
            arrVaix.add(v);

        }
        rs.close();
        stmt.close();

        return arrVaix;
    }

    public Vaixell selectVaixell(int codi) throws SQLException {
        Vaixell v = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT *,(rating*temps_real)as q FROM vaixells v inner join categories c on c.codi_cat=v.categoria  where v.codi = ?";

        stmt = conn.prepareStatement(query);
        stmt.setInt(1, codi);
        rs = stmt.executeQuery();

        while (rs.next()) {

            v = new Vaixell();
            v.setCodi(rs.getInt("codi"));
            v.setNom(rs.getString("nom"));
            Categoria cat1 = new Categoria();
            cat1.setCodi(rs.getInt("codi_cat"));
            cat1.setNom(rs.getString("nom_cat"));
            v.setCategoria(cat1);
            v.setRating(rs.getDouble("rating"));
            v.setClub(rs.getString("club"));
            v.setTipusVaixell(rs.getString("tipus"));
            v.setSenior(false);
            if (rs.getInt("senior") == 1) {
                v.setSenior(true);
            }
            v.setTempsReal(rs.getDouble("temps_real"));

        }
        rs.close();
        stmt.close();

        return v;
    }

    public void insertaVaixell(Vaixell v) throws SQLException {
        if (v != null) {
            String query = "insert into vaixells values(?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, v.getCodi());
            stmt.setString(2, v.getNom());
            stmt.setInt(3, v.getCategoria().getCodi());
            stmt.setDouble(4, v.getRating());
            stmt.setString(5, v.getClub());
            stmt.setString(6, v.getTipusVaixell());
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

    public void modificaVaixell(Vaixell v) throws SQLException {
        String query = "update vaixells set nom=? ,categoria=? ,rating=?,club=? ,tipus=? ,senior=? ,temps_real=? where codi=?;";

        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setString(1, v.getNom());
        stmt.setInt(2, v.getCategoria().getCodi() + 1);
        stmt.setDouble(3, v.getRating());
        stmt.setString(4, v.getClub());
        stmt.setString(5, v.getTipusVaixell());
        if (v.isSenior()) {
            stmt.setInt(6, 1);
        } else {
            stmt.setInt(6, 0);
        }
        stmt.setDouble(7, v.getTempsReal());
        stmt.setInt(8, v.getCodi());
        stmt.executeUpdate();
        stmt.close();
    }

    public void esborraVaixell(int v) throws SQLException {
        String query = "delete from vaixells  where codi=?";

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, v);

        stmt.executeUpdate();
        stmt.close();
    }

    public boolean verificaCodi(int codi) throws SQLException {
        String query = "select codi from vaixells  where codi=?";
        boolean disponible;
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, codi);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {

            disponible = false;

        } else {

            disponible = true;

        }

        stmt.close();
        return disponible;

    }
}
