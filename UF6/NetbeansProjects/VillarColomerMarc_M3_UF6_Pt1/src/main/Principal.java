package main;

import controller.Controlador;
import java.sql.SQLException;
import static persist.UtilBD.createEstructuraMysql;

/**
 *
 * @author marc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Controlador ctl = new Controlador();
        ctl.run();
    }

}
