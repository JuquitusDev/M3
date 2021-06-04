/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf6juny;

import java.sql.SQLException;

/**
 *
 * @author Juquitus
 */
public class ExamenUF6Juny {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) {
        UtilBD.netejaTaules();
        ImmobleDAO imd = new ImmobleDAO();
        Immoble i1 = new Immoble(1, "Casa", "Vallromanes", 200, 200);
        Immoble i2 = new Immoble(2, "Piso", "Vilanova", 400, 200);
        Immoble i3 = new Immoble(3, "Chalé", "Vilanova", 300, 200);
        Immoble i4 = new Immoble(1, "Apartamento", "Granollers", 1000, 200);
        //Inserir 4 immobles
        try {
            System.out.println(imd.inserir(i1));
            System.out.println(imd.inserir(i2));
            System.out.println(imd.inserir(i3));
            System.out.println(imd.inserir(i4));
        } catch (SQLException sqle) {
            System.out.println("Error en l'inserció");
        }
        System.out.println("\n\n\n");
        //Llistar order by codi
        try {
            System.out.println(imd.llistaCodi());
        } catch (SQLException sqle) {
            System.out.println("Error al llistar per codi");
        }
        System.out.println("\n\n\n");

        // Llistar order by preu
        try {
            System.out.println(imd.llistaPreu());
        } catch (SQLException sqle) {
            System.out.println("Error en llistar per preu");
        }
        System.out.println("\n\n\n");

        //Llistar per poblacio i preu
        try {
                System.out.println(imd.llista("Vilanova", 500));
        } catch (SQLException sqle) {
            System.out.println("Error en llistar per població i preu màxim");
        }
        System.out.println("\n\n\n");

        // Esborrar un existent i un que no
        try {
            System.out.println(imd.esborrar(3));
            System.out.println(imd.esborrar(0));
        } catch (SQLException sqle) {
            System.out.println("Error borrant immoble");
        }
        System.out.println("\n\n\n");

        // Llistar ordenat per codi
        try {
            System.out.println(imd.llistaCodi());
        } catch (SQLException sqle) {
            System.out.println("Error llistant per codi");
        }
        System.out.println("\n\n\n");

        // Modificar codi 1
        try {
            System.out.println(imd.modificar(new Immoble(1, "Casoplón", "Granollers", 300, 300)));
        } catch (SQLException sqle) {
            System.out.println("Error modificant");
        }
        System.out.println("\n\n\n");

        // Cercar codi 1
        try {
            System.out.println(imd.cercar(1));
        } catch (SQLException sqle) {
            System.out.println("Error cercant per codi");
        }
        System.out.println("\n\n\n");

        // Llistar ordenat per codi
        try {
            System.out.println(imd.llistaCodi());
        } catch (SQLException sqle) {
            System.out.println("Error llistant per codi");
        }

    }
}
