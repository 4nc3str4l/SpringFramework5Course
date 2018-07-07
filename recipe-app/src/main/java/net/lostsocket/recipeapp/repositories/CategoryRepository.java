package net.lostsocket.recipeapp.repositories;

import net.lostsocket.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {}
