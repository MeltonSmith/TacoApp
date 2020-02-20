package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

/**
 * Author Melton Smith
 * Since: 26/01/2020
 */
public interface TacoRepository  extends CrudRepository<Taco, Long> {

}
