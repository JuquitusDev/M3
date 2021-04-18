package explicacio_excepcions;

public class Excepcio_11 {

    public static void main(String[] args) {

        try {
            provocoExcepcio(0);
            provocoExcepcio(10);
        } catch (LaMevaExcepcio e) {
            e.printStackTrace();
        }

        System.out.println("El programa finalitza correctament");
    }

    public static void provocoExcepcio(int valor) throws LaMevaExcepcio {

        System.out.println("Valor: " + valor);

        if (valor != 0) {
            throw new LaMevaExcepcio(valor);
        }
        System.out.println("No s’ha provocat l’excepció.");
    }
}
