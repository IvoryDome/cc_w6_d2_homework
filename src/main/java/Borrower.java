import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }


    public void addBookToBookCollection(Book book){
        this.borrowedBooks.add(book);
    }

    public void borrowBook(Library library){
        addBookToBookCollection(library.lendBook());
    }

    public int bookCount(){
        return this.borrowedBooks.size();
    }
}
