package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("톰소여의 모험"));
        bookShelf.appendBook(new Book("나미야 잡화점의 비밀"));
        bookShelf.appendBook(new Book("미치게 친절한 철학"));
        bookShelf.appendBook(new Book("해변의 카프카"));

        // 명시적으로 Iterator를 사용하는 방법
        // iterator 인터페이스를 상속한 bookShelf를 통해 iterable 객체를 반환받는다
        Iterator<Book> iterator = bookShelf.iterator();

        while(iterator.hasNext()){
            Book next = iterator.next();
            System.out.println(next.getName());
        }
        System.out.println();


        // 확장 for문을 사용하는 방법
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
