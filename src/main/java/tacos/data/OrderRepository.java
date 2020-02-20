package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

/**
 * Author Melton Smith
 * Since: 26/01/2020
 */
public interface OrderRepository extends CrudRepository<Order, String> {

}
