package lamda.expression.book;

import java.util.Collections;
import java.util.List;

public class BookImplementation {

    public static void main(String[] args) {
        BookDao bookDao = new BookDao();
        bookDao.setBooks();
        List<Book> listOfBooks = bookDao.getBooks();
        listOfBooks.forEach(System.out::println);
        Collections.sort(listOfBooks, (book1, book2) -> book1.getBookName().compareToIgnoreCase(book2.getBookName()));
        listOfBooks.forEach(System.out::println);
    }

}
