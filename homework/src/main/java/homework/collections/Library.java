package homework.collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library{
    private Set<Book> library = new HashSet<>();

    public Library(){}

    public void addBook(Book book){
        library.add(book);
    }

    public void deleteBook(Book book){
        library.remove(book);
    }

    public Book findByName(String title){
        Book findedBook = null;
        for (Book book :
                library) {
            if (book.getTitle().equals(title)){
                findedBook = book;
            }
        }return findedBook;
    }

    public List<Book> findByAuthor(String author){
        ArrayList<Book> books = new ArrayList<>();
        for (Book book :
                library) {
            if (book.getAuthor().equals(author)){
                books.add(book);
            }
        }

        return books;
    }

}
