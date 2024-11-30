package ch01_iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{

    private Book[] books ;
    private int last = 0;
    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
