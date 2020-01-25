package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Author Melton Smith
 * Since: 08/12/2019
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
