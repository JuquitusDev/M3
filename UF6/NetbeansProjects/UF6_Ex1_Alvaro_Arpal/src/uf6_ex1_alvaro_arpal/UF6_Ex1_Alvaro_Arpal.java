/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf6_ex1_alvaro_arpal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import model_ex1.Coche;
import model_ex1.Propietario;

/**
 *
 * @author alvaro
 */
public class UF6_Ex1_Alvaro_Arpal {

    static final String url = "jdbc:mysql://localhost:3306/";
    static final String dbName = "DatosCoches";
    static final String driver = "com.mysql.jdbc.Driver";
    static final String userName = "root";
    static final String password = "root";
    static Connection conn = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, userName, password);

            if (!conn.isClosed()) {
                System.out.println("Database connection is working using TCP/IP ...");
            } else {
                System.out.println("Error");
                System.exit(0);
            }

            BDUtil.createBBDDMysql();
            insertaPropietario(new Propietario("1A", "Pepe", 30));
            insertaPropietario(new Propietario("1B", "Ana", 40));
            insertaPropietario(new Propietario("1C", "Maria", 50));
            insertaCoche(new Coche("MA-1111", "Opel", 1000, "1A"));
            insertaCoche(new Coche("MA-2222", "Renault", 2000, "1A"));
            insertaCoche(new Coche("BA-3333", "Seat", 3000, "1B"));
            insertaCoche(new Coche("BA-3333", "Seat", 3000, "1H"));
            muestraPropietario("1A");
            muestraPropietario("1B");
            muestraPropietario("1C");
            //  borrarPropietario("1A");
            // muestraPropietario("1A");

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

    public static void borrarPropietario(String dni) throws SQLException {
        String query = "delete from DatosCoches.Propietarios where DNI=?;";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        stmt.execute();
    }

    public static boolean compruebaDni(String dni) throws SQLException {
        String query = "SELECT DNI FROM DatosCoches.Propietarios  WHERE DNI = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {

            if (rs.getString("DNI").equals(dni)) {
                return true;
            }
        }

        return false;
    }

    public static void insertaPropietario(Propietario p) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Propietarios values(?,?,?);");
        stmt.setString(1, p.getDni());
        stmt.setString(2, p.getNombre());
        stmt.setInt(3, p.getEdad());

        int count = stmt.executeUpdate();

        System.out.println("Inserted Propietario count: " + count);
        stmt.close();

    }

    public static void insertaCoche(Coche c) throws SQLException {
        if (compruebaDni(c.getDni())) {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Coches values(?,?,?,?);");
            stmt.setString(1, c.getMatricula());
            stmt.setString(2, c.getMarca());
            stmt.setInt(3, c.getPrecio());
            stmt.setString(4, c.getDni());

            int count = stmt.executeUpdate();

            System.out.println("Inserted coche count: " + count);
            stmt.close();
        }
    }

    public static void muestraPropietario(String dniB) throws SQLException {
        String query = "SELECT * FROM DatosCoches.Propietarios p left join DatosCoches.Coches c on c.c_DNI=p.DNI WHERE p.DNI = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, dniB);
        Propietario p = new Propietario();
        Coche c = new Coche();
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            p.setDni(rs.getString("DNI"));
            p.setNombre(rs.getString("Nombre"));
            p.setEdad(rs.getInt("Edad"));

            c.setMatricula(rs.getString("Matricula"));
            c.setMarca(rs.getString("Marca"));
            c.setPrecio(rs.getInt("Precio"));
            c.setDni(rs.getString("c_DNI"));

            p.addCoche(c);

        }

        System.out.println(p);

    }

}
