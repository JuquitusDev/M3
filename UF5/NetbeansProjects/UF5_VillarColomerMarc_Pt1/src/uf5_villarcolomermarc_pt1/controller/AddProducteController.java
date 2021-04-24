/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_villarcolomermarc_pt1.controller;
import uf5_villarcolomermarc_pt1.model.Producte;

/**
 *
 * @author Marc
 */
public class AddProducteController {
    
    public static String validarCodi(String codi){
        try{
        Integer.parseInt(codi);
      }catch (Exception e){
          return "El codi introduit no és numèric";
    }
      return "";  
    }
            
//  String preu, String ubi, String categoria, String tipus, boolean oferta, String stock
    public static String validarPreu(String preu){
        try{
        Double.parseDouble(preu);
      }catch (Exception e){
          return "El preu introduit no és numèric";
    }
      return "";  
    }
     public static String validarStock(String stock){
        try{
        Integer.parseInt(stock);
      }catch (Exception e){
          return "L'stock introduit no és numèric";
    }
      return "";  
    }
     
       public static String validarUbicacio(String ubi){
      if (ubi.length() != 3){
          return "la longitud ha de ser de 3 caràcters";
      }
      return "";
    }
         public static String submitProducte (Producte p){
      

    }
}

