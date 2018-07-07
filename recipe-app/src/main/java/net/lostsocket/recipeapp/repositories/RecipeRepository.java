package net.lostsocket.recipeapp.repositories;

import net.lostsocket.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {}
