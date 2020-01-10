package mvc.api.v1.mapper;

import mvc.api.v1.model.CustomerDTO;
import mvc.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     07:38
 */
@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOtoCustomer(CustomerDTO customerDTO);
}
