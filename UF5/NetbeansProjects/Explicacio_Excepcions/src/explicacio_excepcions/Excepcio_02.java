package explicacio_excepcions;

public class Excepcio_02 {

    public static void main(String[] args) {

        //Exemple de llançament d’excepció capturada
        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {
            System.out.println("Abans d’executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posició " + i + " : " + t[i]);
            }
            System.out.println("Després d’executar el for");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El programador estava a la lluna... S’ha sortit de límits!!!");
        }
        System.out.println("Final del programa");
    }
}
