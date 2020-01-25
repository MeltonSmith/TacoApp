package tacos.data;

import tacos.Ingredient;

/**
 * Author Melton Smith
 * Since: 25/01/2020
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
