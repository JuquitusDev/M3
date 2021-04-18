/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author marc
 */
public class Principal {

    final static String nomFitxer = "info";

    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            Curs cur = new Curs("smx");
            Nota not1 = new Nota(8, "m3");
            Nota not2 = new Nota(6, "m2");

            Alumne alu1 = new Alumne("peter", 10);

            alu1.llisNota.add(not1);
            alu1.llisNota.add(not2);

            Alumne alu2 = new Alumne("marc", 30);
            
            alu2.llisNota.add(not1);
            alu2.llisNota.add(not2);
            
            Alumne alu3 = new Alumne("gitgo", 25);
            alu3.llisNota.add(not1);
            alu3.llisNota.add(not2);

            cur.llisAlumnes.add(alu1);
            cur.llisAlumnes.add(alu2);
            cur.llisAlumnes.add(alu3);
            
            FileOutputStream fos = new FileOutputStream(nomFitxer, false);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(cur);
            oos.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    try{
    FileInputStream fis = new FileInputStream(nomFitxer);
    ObjectInputStream ois = new ObjectInputStream(fis);
     Curs curs = (Curs)ois.readObject();
        for (Alumne al : curs.llisAlumnes) {
            System.out.println(al.toString());  
        }
    
    
    }catch(Exception e){
        e.printStackTrace();
    }
}
}
