package homework.exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import homework.exceptions.Book;

public class BookRepository implements Repository<Book> {
    Map<String, Book> repository = new HashMap<>();

    @Override
    public List findAll() {
        return (List<String>) new ArrayList(repository.keySet());
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        Book book = null;
        for (Map.Entry<String, Book> entry :
                repository.entrySet()) {
            if (entry.getValue().getId().equals(id)) {
                book = entry.getValue();
            }
        }
        if (book == null) {
            throw new ItemNotFoundException("Id is not found");
        }
        return book;
    }


    @Override
    public void save(Book item) {
     repository.put(item.getId(), item);

    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        boolean bookWasRemoved = false;
        for (Map.Entry<String, Book> entry :
                repository.entrySet()) {
            if (entry.getValue().getId().equals(id)) {
                repository.remove(entry.getKey());
                bookWasRemoved = true;
            }
        }
        if (!bookWasRemoved) {
            throw new ItemNotFoundException("Book is not found");
        }

    }
}
