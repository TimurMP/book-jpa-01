package telran.java2022.dao;

import org.springframework.data.repository.CrudRepository;
import telran.java2022.book.model.Author;

public interface AuthorRepository extends CrudRepository<Author, String> {
}