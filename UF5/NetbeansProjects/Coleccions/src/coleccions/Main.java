package coleccions;

/**
 *
 * @author Marc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Exercici 1
       /* Pila pila1 = new Pila<Integer>();
        System.out.println(pila1.empty());
        pila1.push(1);
        pila1.push(2);
        System.out.println(pila1.empty());
        System.out.println(pila1.pop());
        System.out.println(pila1.pop());
        System.out.println(pila1.empty());
        System.out.println("\n");
//Exercici 2      
        Cua cua1 = new Cua<Integer>();
        System.out.println(cua1.empty());
        cua1.add(1);
        cua1.add(2);
        System.out.println(cua1.empty());
        cua1.get();
        System.out.println(cua1.get());
        System.out.println(cua1.empty());
        System.out.println("\n");
//Exercici 3         
        Impressora impr = new Impressora();
        System.out.println(impr.empty());
        Document doc1 = new Document("doc1");
        Document doc2 = new Document("doc2");
        impr.addDocument(doc1);
        impr.addDocument(doc2);
        System.out.println(impr.empty());
        System.out.println(impr.impimirDocument());
        System.out.println(impr.impimirDocument());
        System.out.println(impr.empty());*/
//Exercici 4
        Peatge p = new Peatge();
        Cotxe c1 = new Cotxe("mat1");
        Cotxe c2 = new Cotxe("mat2");
        Cotxe c3 = new Cotxe("mat3");
        Cotxe c4 = new Cotxe("mat4");
        Cotxe c5 = new Cotxe("mat5");
        Cotxe c6 = new Cotxe("mat6");
        Cotxe c7 = new Cotxe("mat7");
        Cotxe c8 = new Cotxe("mat8");
        Cotxe c9 = new Cotxe("mat9");
        Cotxe c10 = new Cotxe("mat10");
        p.entraCotxe(c1);
        p.entraCotxe(c2);
        p.entraCotxe(c3);
        p.entraCotxe(c4);
        p.entraCotxe(c5);
        p.entraCotxe(c6);
        p.entraCotxe(c7);
        p.surtCotxe();
        p.surtCotxe();
        p.entraCotxe(c8);
        p.entraCotxe(c9);
        p.surtCotxe();
        p.entraCotxe(c10);
        while (!p.comprovarEmptyPeatge()) {
            p.surtCotxe();
        }
        p.surtCotxe();
    }

}
