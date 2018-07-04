package net.lostsocket.spring5webapp.repositories;

import net.lostsocket.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
