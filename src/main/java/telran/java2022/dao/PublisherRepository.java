package telran.java2022.dao;

import org.springframework.data.repository.CrudRepository;
import telran.java2022.book.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, String> {
}
