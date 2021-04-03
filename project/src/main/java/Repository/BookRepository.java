package Repository;

import com.project.project.domain.Book;

import java.util.List;
import java.util.UUID;

public interface BookRepository {

    List<Book> findAll();

    Book findByUid(UUID uid);

    void add(Book book);

    void delete(Book book);

}
