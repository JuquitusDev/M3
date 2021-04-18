/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Juquitus
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      
        // ArrayIndexOutOfBoundsException 
        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {
            System.out.println("Abans d’executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posició " + i + " : " + t[i]);
            }
            System.out.println("Després d’executar el for");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El programador s’ha sortit de límits: " + e.getMessage());
        }

    
        // RuntimeException 
        try{
        String c;
        System.out.println(c);
        } catch (RuntimeException rte){
            System.out.println("El programador no ha declarat la variable c. Error: " + rte.getMessage());   
        }
    
    
        // ArithmeticalException
        
        int divident = 3;
        int divisor = 0;
        try{
            int resultat = divident/divisor;
        }catch(ArithmeticException math){
            System.out.println("No es pot dividir entre 0.   Error: " + math.getMessage());    
        }
        
        
        // StringIndexOutOfBoundsException
       String s = "s";
        try{
            System.out.println(s.charAt(1));
        }catch(StringIndexOutOfBoundsException str){
            System.out.println("El string no té charAt1");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
