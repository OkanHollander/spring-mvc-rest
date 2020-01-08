package mvc.bootstrap;

import mvc.domain.Category;
import mvc.domain.Customer;
import mvc.repositories.CategoryRepository;
import mvc.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     15:08
 */
@Component
@Profile("default")
public class DataLoader implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public DataLoader(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCategories();
        loadCustomers();
    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        Category fresh = new Category();
        fresh.setName("Fresh");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);
        categoryRepository.save(fresh);

        System.out.println("Categories Loaded... \n\tFound " + categoryRepository.count() + " categories.");
    }

    private void loadCustomers() {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstName("Okan");
        customer1.setLastName("Hollander");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFirstName("Lavinia");
        customer2.setLastName("Petcu");
        customerRepository.save(customer2);

        System.out.println("Customers loaded... \n\tFound " + customerRepository.count() + " customers.");

    }


}
