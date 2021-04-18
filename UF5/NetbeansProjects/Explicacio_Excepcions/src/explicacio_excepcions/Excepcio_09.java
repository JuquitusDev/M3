package explicacio_excepcions;

public class Excepcio_09 {

    /* Mètode que avalua si la taula t té n cel · les, provocant, en cas de ser
    avaluada com a fals, una excepció d’obligada gestió: Exception */
    public static void verificaLengthTaula(int n, String t[]) throws Exception {

        if (t.length != n) {
            throw new Exception("La taula no té la llargada indicada:"+n);
        }
        System.out.println("Sortida de verificaLengthTaula:"+ n);
    }

    public static void main(String args[]) {

        try {
            System.out.println("Punt 1.");
            verificaLengthTaula(4, new String[4]);
            System.out.println("Punt 2.");
            verificaLengthTaula(2, new String[4]);
            System.out.println("Punt 3.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Programa finalitzat.");
    }

}
