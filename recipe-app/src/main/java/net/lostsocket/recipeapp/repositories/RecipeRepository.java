package net.lostsocket.recipeapp.repositories;

import net.lostsocket.recipeapp.domain.Category;
import net.lostsocket.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Category> findByDescription(String description);
}
