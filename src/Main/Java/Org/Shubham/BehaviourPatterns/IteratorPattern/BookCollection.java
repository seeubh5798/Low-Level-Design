package Main.Java.Org.Shubham.BehaviourPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCollection {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public Iterator<Book> iterator(){
        return new BookIterator();
    }

//    nested iterator class //
    private class BookIterator implements Iterator<Book>{
        private int position =0;
        /**
         * @return
         */
        @Override
        public boolean hasNext() {
//            System.out.println(books.toString().getName());
            return position < books.size() ? true : false;
        }

        /**
         * @return
         */
        @Override
        public Book next() {
            return books.get(position++);
        }
    }





}
