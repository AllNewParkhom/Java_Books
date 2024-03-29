package Repository;

import dto.Publisher;

import java.util.List;
import java.util.UUID;

public interface PublisherRepository {

    List<Publisher> findAll();

    Publisher findByUid(UUID uid);

    void add(Publisher publisher);

    void delete(Publisher publisher);

}
