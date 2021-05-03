package homework.exceptions;

import java.util.Objects;

public class Book {
    private final String id;
    private final String title;
    private final String author;
    private final int pagesCount;

    public Book(String id, String title, String author, int pagesCount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesCount == book.pagesCount && Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, pagesCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
