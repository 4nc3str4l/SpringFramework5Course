package net.lostsocket.spring5webapp.repositories;

import net.lostsocket.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
