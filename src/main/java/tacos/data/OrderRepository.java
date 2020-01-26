package tacos.data;

import tacos.Order;

/**
 * Author Melton Smith
 * Since: 26/01/2020
 */
public interface OrderRepository {

    Order save(Order order);
}
