package mvc.repositories;

import mvc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     14:50
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
