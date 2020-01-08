package mvc.api.v1.mapper;

import mvc.api.v1.model.CustomerDTO;
import mvc.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     08:24
 */
public class CustomerMapperTest {
    public static final Long ID = 1L;
    public static final String FIRST_NAME = "Joe";
    public static final String LAST_NAME = "Buck";

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception{
        // given
        Customer customer = new Customer();
        customer.setId(ID);
        customer.setFirstName(FIRST_NAME);
        customer.setLastName(LAST_NAME);

        // when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        // then
        assertEquals(ID, customerDTO.getId());
        assertEquals(FIRST_NAME, customerDTO.getFirstName());
        assertEquals(LAST_NAME, customerDTO.getLastName());
    }

    @Test
    public void customerDTOtoCustomer() {
        // given
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(ID);
        customerDTO.setFirstName(FIRST_NAME);
        customerDTO.setLastName(LAST_NAME);

        // when
        Customer customer = customerMapper.customerDTOtoCustomer(customerDTO);

        // then
        assertEquals(ID, customer.getId());
        assertEquals(FIRST_NAME, customer.getFirstName());
        assertEquals(LAST_NAME, customer.getLastName());
    }
}
