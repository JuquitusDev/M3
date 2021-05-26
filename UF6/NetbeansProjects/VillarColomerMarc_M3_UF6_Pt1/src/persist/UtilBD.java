/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Categoria;
import model.Vaixell;

/**
 *
 * @author marc
 */
public class UtilBD {

    public static void createEstructuraMysql() throws SQLException {

        BaseDAO.connect();
        Connection conn = BaseDAO.getConn();
        PreparedStatement stmt;
        String query = "CREATE TABLE vaixells "
                + "(codi integer NOT NULL, "
                + " nom text,"
                + " categoria int,"
                + "rating double,"
                + "club text,"
                + "tipus text,"
                + "senior int,"
                + "temps_real double,"
                + " PRIMARY KEY (codi)"
                + ")";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE categories "
                + "(codi_cat integer NOT NULL, "
                + " nom_cat text,"
                + " PRIMARY KEY (codi_cat)"
                + ")";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "ALTER TABLE `naval`.`vaixells` "
                + "ADD CONSTRAINT `fk_vaixells_1`"
                + "  FOREIGN KEY (`categoria`)"
                + "  REFERENCES `naval`.`categories` (`codi_cat`)";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        CategoriaDAO cd = new CategoriaDAO();
        VaixellDAO vd = new VaixellDAO();
        Categoria c1 = new Categoria(1, "Crussier");
        Categoria c2 = new Categoria(2, "Performance");
        Categoria c3 = new Categoria(3, "High Level");
        cd.insertarCategoria(c1);
        cd.insertarCategoria(c2);
        cd.insertarCategoria(c3);
        vd.insertaVaixell(new Vaixell(1, "Alvaro", c1, 2.88, "Vallbona", "creuer", true, 56.5));
        vd.insertaVaixell(new Vaixell(31, "Xavi", c2, 1.12, "Vallbona", "regata", false, 15.2));
        vd.insertaVaixell(new Vaixell(234, "Marc", c3, 5.34, "Vallbona", "creuer-regata", true, 12.3));
        vd.insertaVaixell(new Vaixell(12, "Alfredo", c2, 6.66, "Vallbona", "regata", false, 54.22));

    }
}
