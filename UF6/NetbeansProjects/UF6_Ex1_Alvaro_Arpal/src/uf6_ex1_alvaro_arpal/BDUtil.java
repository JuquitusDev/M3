/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf6_ex1_alvaro_arpal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import static uf6_ex1_alvaro_arpal.UF6_Ex1_Alvaro_Arpal.conn;

/**
 *
 * @author alvaro
 */
public class BDUtil {

    public static void createBBDDMysql() throws SQLException {
        PreparedStatement stmt;
        String query = "drop database if exists DatosCoches;";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "create database DatosCoches;  ";

        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "use DatosCoches;  ";

        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE Propietarios "
                + "(DNI VARCHAR(10), "
                + "Nombre VARCHAR(40), "
                + "Edad INT, "
                + "UNIQUE KEY (DNI)"
                + ");";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE Coches ("
                + "    Matricula VARCHAR(10),"
                + "    Marca VARCHAR(20),"
                + "    Precio INTEGER,"
                + "    c_DNI VARCHAR(10),"
                + "    UNIQUE KEY (Matricula),"
                + "    FOREIGN KEY (c_DNI) "
                + "    REFERENCES Propietarios (DNI) on delete cascade"
                + ");";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

        System.out.println("BBDD Creada con exito");
    }

}
