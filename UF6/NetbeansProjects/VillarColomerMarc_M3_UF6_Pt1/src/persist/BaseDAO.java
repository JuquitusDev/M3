/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marc
 */
public class BaseDAO {

    static final String url = "jdbc:mysql://localhost:3306/";
    static final String dbName = "naval";                  //Nom de la nostra BBDD
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String userName = "root";
    static final String password = "";

    protected static Connection conn = null;
    //  private static DataSource ds;

    public static void connect() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url + dbName, userName, password);
                UtilBD.createEstructuraMysql();
            } catch (SQLException | ClassNotFoundException ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }

    }

    public static Connection getConn() {
        return conn;
    }

    public static void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
        conn = null;
    }
}
