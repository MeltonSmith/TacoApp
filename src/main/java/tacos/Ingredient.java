package tacos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author Melton Smith
 * Since: 08/12/2019
 */
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Ingredient {
    @Id
    private final String id;

    private final String name;
    private final String type;

//    public static enum Type{
//        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
//    }
}
