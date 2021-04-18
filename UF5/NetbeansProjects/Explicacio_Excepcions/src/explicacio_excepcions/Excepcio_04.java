package explicacio_excepcions;

public class Excepcio_04 {

    //Exemple de llançament d’excepció en mètode interior
    //sense captura en cap mètode
    public static void met02() {

        String t[] = {"Hola", "Adéu", "Fins demà"};
        for (int i = 0; i <= t.length; i++) {
            System.out.println("Posició " + i + " : " + t[i]);
        }
        System.out.println("El mètode met02 s’ha acabat.");
    }

    public static void met01() {

        System.out.println("Entrem en el mètode met01 i anem a executar met02");
        met02();
        System.out.println("Tornem a estar en met01 després de finalitzar met02");
    }

    public static void main(String args[]) {
        System.out.println("Iniciem el programa i anem a executar met01");
        met01();
        System.out.println("Tornem a estar en el main després de finalitzar met01");
    }

}
