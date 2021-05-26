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
import static persist.BaseDAO.conn;

/**
 *
 * @author alvaro
 */
public class CategoriaDAO extends BaseDAO {

    public CategoriaDAO() {
        connect();
    }

    public void insertarCategoria(Categoria c) throws SQLException {
        String query = "insert into categories values(?,?)";

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, c.getCodi());
        stmt.setString(2, c.getNom());
        stmt.executeUpdate();
        stmt.close();
    }

    public Categoria selectCategoria(int codi) throws SQLException {

        Categoria c = null;
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * FROM categories where codi_cat=?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, codi);
        rs = stmt.executeQuery();
        while (rs.next()) {
            c = new Categoria();
            c.setCodi(rs.getInt("codi_cat"));
            c.setNom(rs.getString("nom_cat"));
        }
        rs = stmt.executeQuery();
        return c;
    }
}
