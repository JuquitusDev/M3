package explicacio_excepcions;


public class Excepcio_01 {


    public static void main(String[] args) {
        
        //Exemple de llançament d’excepció no capturada
        
        String t[]={"Hola","Adéu","Fins demà"};
        for (int i=0; i<=t.length; i++){
            System.out.println("Posició " + i + " : " + t[i]);                    
        }
        System.out.println("El programa s’ha acabat");
    }
}
