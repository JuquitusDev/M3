package explicacio_excepcions;

public class Excepcio_03 {

    public static void main(String[] args) {

        //Exemple de llançament d’excepció amb intent erroni
        //de captura i mètode finally
        String t[] = {"Hola", "Adéu", "Fins demà"};
        try {
            System.out.println("Abans d’executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posició " + i + " : " + t[i]);
            }
            System.out.println("Després d’executar el for");
        } catch (StringIndexOutOfBoundsException e) {
            //L'Excepcio correcte seria IndexOutOfBoundsException
            System.out.println("El programador estava a la lluna... S’ha sortir de límits!!!");
        } finally {
            System.out.println("Aquest codi s’executa, peti qui peti!!!");
        }
        System.out.println("Final del programa");
    }
}
