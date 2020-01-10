package mvc.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     07:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerListDTO {

    List<CustomerDTO> customers;
}
