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
        Pila pila1 = new Pila<Integer>();
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
        System.out.println(impr.empty());
//Exercici 4


    
    
    }

}
