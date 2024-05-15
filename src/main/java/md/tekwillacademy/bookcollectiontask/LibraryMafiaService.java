package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryMafiaService {
    public static void main(String[] args) {
        Library carturestiLibrary001 = new Library("Carturesti");
        System.out.println(carturestiLibrary001.getTheNumberOfTheBooksInTheStock());

        Book DorulBook01 = new Book("Dorul1", "Ion Druta");
        Book DorulBook02 = new Book("Dorul2", "Ion Druta");
        Book DorulBook03 = new Book("Dorul3", "Ion Druta");

        carturestiLibrary001.addBook(DorulBook02);
        carturestiLibrary001.addBook(DorulBook02);
        carturestiLibrary001.addBook(DorulBook03);

        System.out.println(carturestiLibrary001.getTheNumberOfTheBooksInTheStock());

        System.out.println(carturestiLibrary001.containsBook(DorulBook01));
        carturestiLibrary001.printTheBookTitles();

        Library librariusLibrary001 = new Library("Librarius");
        Book damaCuCamelii = new Book("Dama cu Camelii", "Alexandre Dumas");

        librariusLibrary001.addBook(damaCuCamelii);
        librariusLibrary001.addBook(DorulBook02);

        Map<String, Library> lanturiDelibrarii = new HashMap();

        lanturiDelibrarii.put("Str. Ion Creanga 2/3", carturestiLibrary001);
        lanturiDelibrarii.put("Str.Stefan Cel Mare 3/7", librariusLibrary001);


        for (Map.Entry<String, Library> dataSet : lanturiDelibrarii.entrySet()) {
            ;
            System.out.println("The key is: " + dataSet.getKey());
            System.out.println("The books are: ");
            dataSet.getValue().printTheBookTitles();


        }
    }
}