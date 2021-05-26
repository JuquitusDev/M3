/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author Juquitus
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebam3", "root", "");
            Statement miStatement = miConexion.createStatement();
            ResultSet result = miStatement.executeQuery("SELECT * FROM PRODUCTOS");
            while(result.next()){
                System.out.println(result.getString("ID")+ "\n"  +result.getString("NOMBRE"));
            }
        } catch (Exception e) {
            System.out.println("FAIL");
            
        }
    }
}
