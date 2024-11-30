package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return bookShelf.getLength() > index;
    }

    @Override
    public Book next() {
        if (!hasNext()){
            throw new NoSuchElementException("마지막 페이지입니다");
        }
        return bookShelf.getBookAt(index++);
    }
}
