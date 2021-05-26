/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf6juny;

import examenuf6juny.BaseDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author marc
 */
public class ImmobleDao extends BaseDAO {

    public ImmobleDao() {
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

    public boolean inserir(Immoble im) throws SQLException {
        int count = 0;
        if (im != null) {
            String query = "insert into immobles values(?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, im.getCodi());
            stmt.setString(2, im.getDescripcio());
            stmt.setString(3, im.getPoblacio());
            stmt.setDouble(4, im.getPreu());
            stmt.setInt(5, im.getMetres());
         count = stmt.executeUpdate();
            stmt.close();
        }
        return count > 0;
    }

    public boolean modifica(Immoble im) throws SQLException {
        int count = 0;
        if (im != null) {
        String query = "update immobles set descripcio=? ,poblacio=?,preu=? ,metres=? where codi=?;";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, im.getDescripcio());
        stmt.setString(2, im.getPoblacio());
        stmt.setDouble(3, im.getPreu());
        stmt.setDouble(4, im.getMetres());
        stmt.setInt(5, im.getCodi());
        stmt.executeUpdate();
        stmt.close();
    }
        return count > 0;
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
