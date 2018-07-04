package net.lostsocket.spring5webapp.repositories;

import net.lostsocket.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
