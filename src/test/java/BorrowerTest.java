import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        library.setCapacity(10);
        book1 = new Book("LOTR: Fellowship of the Ring", "Fantasy");
        book2 = new Book("Catch 22", "Black Comedy");
        book3 = new Book("Fear and Loathing in Las Vegas", "Black Comedy");
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        borrower = new Borrower("Dave");
    }

    @Test
    public void testIfBorrowingWorks(){
        borrower.borrowBook(library);
        assertEquals(2, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }






}
