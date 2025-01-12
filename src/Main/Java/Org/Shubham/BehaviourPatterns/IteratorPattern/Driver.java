package Main.Java.Org.Shubham.BehaviourPatterns.IteratorPattern;

import kotlin.collections.BooleanIterator;

public class Driver {

    public static void main(String[] args) {
        BookCollection bc = new BookCollection();
        bc.addBook(new Book("C++"));
        bc.addBook(new Book("Java"));
        bc.addBook(new Book("Javascipt"));
        bc.addBook(new Book("Rust"));

        Iterator<Book> itr = bc.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().getName());
        }

    }
}
