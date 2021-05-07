package homework.collections;

public class LibraryDemo {
    public static void main(String[] args) {
        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");
        Library library = new Library();
        library.addBook(bookOne);
        library.addBook(bookTwo);
        System.out.println(library.findByName("War and Peace"));
        System.out.println(library.findByAuthor("Leo Tolstoy"));
    }
}
