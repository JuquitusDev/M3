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
public class ImmobleDAO extends BaseDAO {

    public ImmobleDAO() {
        connect();
    }

    public ArrayList<Immoble> llista(String poblacio, double preuMax) throws SQLException {
        ArrayList<Immoble> im = new ArrayList();
        Immoble i = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * from immobles where poblacio=? and preu < ? ";

        stmt = conn.prepareStatement(query);
        stmt.setString(1, poblacio);
        stmt.setDouble(2, preuMax);
        rs = stmt.executeQuery();

        while (rs.next()) {

            i = new Immoble();
            i.setCodi(rs.getInt("codi"));
            i.setDescripcio(rs.getString("descripcio"));
            i.setPoblacio(rs.getString("poblacio"));
            i.setPreu(rs.getDouble("preu"));
            i.setMetres(rs.getInt("metres"));
            im.add(i);
        }
        rs.close();
        stmt.close();

        return im;
    }

    public ArrayList<Immoble> llistaCodi() throws SQLException {
        ArrayList<Immoble> im = new ArrayList();
        Immoble i = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * from immobles order by codi";

        stmt = conn.prepareStatement(query);
        rs = stmt.executeQuery();

        while (rs.next()) {

            i = new Immoble();
            i.setCodi(rs.getInt("codi"));
            i.setDescripcio(rs.getString("descripcio"));
            i.setPoblacio(rs.getString("poblacio"));
            i.setPreu(rs.getDouble("preu"));
            i.setMetres(rs.getInt("metres"));
            im.add(i);
        }
        rs.close();
        stmt.close();

        return im;
    }

    public ArrayList<Immoble> llistaPreu() throws SQLException {
        ArrayList<Immoble> im = new ArrayList();
        Immoble i = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * from immobles order by preu";

        stmt = conn.prepareStatement(query);
        rs = stmt.executeQuery();

        while (rs.next()) {

            i = new Immoble();
            i.setCodi(rs.getInt("codi"));
            i.setDescripcio(rs.getString("descripcio"));
            i.setPoblacio(rs.getString("poblacio"));
            i.setPreu(rs.getDouble("preu"));
            i.setMetres(rs.getInt("metres"));
            im.add(i);
        }
        rs.close();
        stmt.close();

        return im;
    }

    public Immoble cercar(int codi) throws SQLException {
        Immoble i = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * from immobles where codi = ?";

        stmt = conn.prepareStatement(query);
        stmt.setInt(1, codi);
        rs = stmt.executeQuery();

        while (rs.next()) {

            i = new Immoble();
            i.setCodi(rs.getInt("codi"));
            i.setDescripcio(rs.getString("descripcio"));
            i.setPoblacio(rs.getString("poblacio"));
            i.setPreu(rs.getDouble("preu"));
            i.setMetres(rs.getInt("metres"));
        }
        rs.close();
        stmt.close();

        return i;
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

    public boolean modificar(Immoble im) throws SQLException {
        int count = 0;
        if (im != null) {
            String query = "update immobles set descripcio=? ,poblacio=?,preu=? ,metres=? where codi=?;";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, im.getDescripcio());
            stmt.setString(2, im.getPoblacio());
            stmt.setDouble(3, im.getPreu());
            stmt.setDouble(4, im.getMetres());
            stmt.setInt(5, im.getCodi());
            count = stmt.executeUpdate();
            stmt.close();
        }
        return count > 0;
    }

    public boolean esborrar(int c) throws SQLException {
        int count = 0;
        String query = "delete from immobles where codi=?";

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, c);

        count = stmt.executeUpdate();
        stmt.close();
        return count > 0;
    }

    /*  public boolean verificaCodi(int codi) throws SQLException {
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

    }*/
}
