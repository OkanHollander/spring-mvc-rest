package mvc.services;

import mvc.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     07:42
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

    CustomerDTO saveCustomerByDto(Long id, CustomerDTO customerDTO);

    CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);

    void deleteCustomerById(Long id);
}
