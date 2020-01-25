package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Author Melton Smith
 * Since: 09/12/2019
 */
@Data
@RequiredArgsConstructor
public class Taco {
    private Long id;

    private Date createdAt;

    @NotNull
    @Size(min=5, message = "Name must be at least 5 characters long")
    String name;

    @Size(min=1, message="You must choose at least 1 ingredient")
    List<String> ingredients;
}
