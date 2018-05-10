package tr.com.jowl.repository;

import tr.com.jowl.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * The UserRepository class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

    User findByEmail(String email);
}