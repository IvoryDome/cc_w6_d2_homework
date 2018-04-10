import java.util.ArrayList;


public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;


    public Library(){
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBookToLibrary(Book book){
        if (checkIfLibraryIsFull()){
            this.bookCollection.add(book);
        }
    }

    public int bookCount(){
        return this.bookCollection.size();
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public boolean checkIfLibraryIsFull(){
        return bookCount() < capacity;
    }

    public Book lendBook(){
        return this.bookCollection.remove(0);
    }

//    public Book lendBook(Book book) {
////        for (int i = 0; i < bookCount(); i++) {
////            if (this.bookCollection.get(i) == book) {
////                Book bookFound = this.bookCollection.remove(i);
////            }
////
////        }
//        for (Book book_found:bookCollection
//             ) {
//            if (book_found == book) return book_found;
//        }
//        return null;
//    }





}
