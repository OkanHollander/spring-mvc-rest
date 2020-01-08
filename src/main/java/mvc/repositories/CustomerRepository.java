package mvc.repositories;

import mvc.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     07:41
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
