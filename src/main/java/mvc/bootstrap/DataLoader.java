package mvc.bootstrap;

import mvc.domain.Category;
import mvc.domain.Customer;
import mvc.domain.Vendor;
import mvc.repositories.CategoryRepository;
import mvc.repositories.CustomerRepository;
import mvc.repositories.VendorRepository;
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
    private final VendorRepository vendorRepository;

    @Autowired
    public DataLoader(CategoryRepository categoryRepository,
                      CustomerRepository customerRepository,
                      VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCategories();
        loadCustomers();
        loadVendors();
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

    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setId(1L);
        vendor1.setName("Western Tasty Fruits Ltd.");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setId(2L);
        vendor2.setName("Exotic Fruits Company");
        vendorRepository.save(vendor2);

        Vendor vendor3 = new Vendor();
        vendor3.setId(3L);
        vendor3.setName("Home Fruits");
        vendorRepository.save(vendor3);

        Vendor vendor4 = new Vendor();
        vendor4.setId(4L);
        vendor4.setName("Fun Fresh Fruits Ltd.");
        vendorRepository.save(vendor4);

        Vendor vendor5 = new Vendor();
        vendor5.setId(5L);
        vendor5.setName("Nuts for Nuts Company");
        vendorRepository.save(vendor5);

        Vendor vendor6 = new Vendor();
        vendor6.setId(6L);
        vendor6.setName("Franks Fresh Fruits from France Ltd.");
        vendorRepository.save(vendor6);

        Vendor vendor7 = new Vendor();
        vendor7.setId(7L);
        vendor7.setName("Marche Gare 6");
        vendorRepository.save(vendor7);

        Vendor vendor8 = new Vendor();
        vendor8.setId(8L);
        vendor8.setName("Marche Gare 5");
        vendorRepository.save(vendor8);

        Vendor vendor9 = new Vendor();
        vendor9.setId(9L);
        vendor9.setName("Marche Gare 4");
        vendorRepository.save(vendor9);

        Vendor vendor10 = new Vendor();
        vendor10.setId(10L);
        vendor10.setName("Marche Gare 2");
        vendorRepository.save(vendor10);

        System.out.println("Loaded vendors... \n\tFound " + vendorRepository.count() + " vendors.");
    }


}
