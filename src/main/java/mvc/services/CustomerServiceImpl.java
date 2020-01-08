package mvc.services;

import mvc.api.v1.mapper.CustomerMapper;
import mvc.api.v1.model.CustomerDTO;
import mvc.domain.Customer;
import mvc.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     07:45
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository
                .findAll()
                .stream()
                .map(customer -> {
                    CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);
                    customerDTO.setCustomerUrl("/api/v1/customers/" + customer.getId());
                    return customerDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerById(Long id) {

        return customerRepository.findById(id)
                .map(customerMapper::customerToCustomerDTO)
                .orElseThrow(RuntimeException::new); //todo implement better exception handling
    }


    @Override
    public CustomerDTO createNewCustomer(CustomerDTO customerDTO) {

        Customer customer = customerMapper.customerDTOtoCustomer(customerDTO);

        Customer savedCustomer = customerRepository.save(customer);

        CustomerDTO returnDto = customerMapper.customerToCustomerDTO(savedCustomer);

        returnDto.setCustomerUrl("/api/v1/customer/" + savedCustomer.getId());

        return returnDto;
    }

    private CustomerDTO saveCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        CustomerDTO returnDto = customerMapper.customerToCustomerDTO(savedCustomer);

        returnDto.setCustomerUrl("/api/v1/customer/" + savedCustomer.getId());

        return returnDto;
    }

    @Override
    public CustomerDTO saveCustomerByDto(Long id, CustomerDTO customerDTO) {
        Customer customer = customerMapper.customerDTOtoCustomer(customerDTO);
        customer.setId(id);

        return saveCustomer(customer);
    }
}
