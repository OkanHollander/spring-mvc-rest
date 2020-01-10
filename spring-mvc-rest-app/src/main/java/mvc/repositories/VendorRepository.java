package mvc.repositories;

import mvc.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author:   Okan Hollander
 * Date:     09/01/2020
 * Time:     10:52
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
