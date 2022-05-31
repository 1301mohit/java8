package lamda.expression.book;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private List<Book> listOfBooks = new ArrayList<>(){};

    public void setBooks() {
        listOfBooks.add(new Book(1, "pqr"));
        listOfBooks.add( new Book(2, "abc"));
        listOfBooks.add(new Book(3, "def"));
    }
    public List<Book> getBooks() {
        return listOfBooks;
    }
}
