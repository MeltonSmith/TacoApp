package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.User;

/**
 * Author Melton Smith
 * Since: 20/02/2020
 */
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
}

