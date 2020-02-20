package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

/**
 * Author Melton Smith
 * Since: 25/01/2020
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {



}
