/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf6_ex2_alvaro_arpal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model_ex2.Director;
import model_ex2.Pelicula;

/**
 *
 * @author alvaro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static final String url = "jdbc:mysql://localhost:3306/";
    static final String dbName = "Cine";
    static final String driver = "com.mysql.jdbc.Driver";
    static final String userName = "root";
    static final String password = "root";
    static Connection conn = null;

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);

            if (!conn.isClosed()) {
                System.out.println("Database connection is working using TCP/IP ...");
            } else {
                System.out.println("Error");
                System.exit(0);
            }
            Date d = new Date(120, 5, 6);
            NewClass.createBBDDMysql();
            insertaDirector(new Director(1, "Alvaro"));
            insertaPeli(new Pelicula(392, "Peli1", d, 800));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void insertaDirector(Director c) throws SQLException {

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Directores values(?,?);");

        stmt.setInt(1, c.getId());
        stmt.setString(2, c.getNombre());

        int count = stmt.executeUpdate();

        System.out.println("Inserted Director count: " + count);
        stmt.close();

    }

    public static void insertaPeli(Pelicula p) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Peliculas values(?,?,?);");
        stmt.setInt(1, p.getPeli_id());
        stmt.setString(2, p.getTitulo());
        stmt.setDate(3, p.getFechaEstreno());
        int count = stmt.executeUpdate();

        System.out.println("Inserted pelicula count: " + count);
        stmt.close();
        Director d = new Director(1, "Alvaro");
        p.addDirector(d);
        stmt = conn.prepareStatement("INSERT INTO peliculas_directores values(?,?);");
        stmt.setInt(1, p.getPeli_id());
        stmt.setInt(2, p.getDirectores().get(0).getId());
        stmt.executeUpdate();

    }
}
