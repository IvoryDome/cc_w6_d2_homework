import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library2;

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

    }


    @Test
    public void bookCountWorks(){
        assertEquals(3, library.bookCount());
    }

    @Test
    public void addBookWorks(){
        book4 = new Book("The Hobbit","Fantasy");
        library.addBookToLibrary(book4);
        assertEquals(4, library.bookCount());
    }


    @Test
    public void checkIfMaxCapacityWorks(){
        library2 = new Library();
        library2.setCapacity(1);
        library2.addBookToLibrary(book1);
        library2.addBookToLibrary(book1);
        assertEquals(1, library2.bookCount());
    }



}
