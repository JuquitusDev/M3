/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf6_ex2_alvaro_arpal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import static uf6_ex2_alvaro_arpal.NewMain.conn;

/**
 *
 * @author alvaro
 */
public class NewClass {

    public static void createBBDDMysql() throws SQLException {
        PreparedStatement stmt;

        String query = "CREATE TABLE Peliculas( "
                + "p_id int, "
                + "Titulo VARCHAR(40), "
                + "fechaEstreno date, "
                + "UNIQUE KEY (p_id)"
                + ");";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE Directores ("
                + "    d_id int,"
                + "    Nombre VARCHAR(20),"
                + "    UNIQUE KEY (d_id)"
                + ");";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE peliculas_directores ("
                + "pelicula_id int not null primary key,"
                + "director_id int not null ,"
                + "    FOREIGN KEY (pelicula_id) "
                + "    REFERENCES Peliculas (p_id),"
                + "    FOREIGN KEY (director_id) "
                + "    REFERENCES Directores (d_id),"
                + "unique key (director_id)"
                + ");";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

        System.out.println("BBDD Creada con exito");
    }
}
