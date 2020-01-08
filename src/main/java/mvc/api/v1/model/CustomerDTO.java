package mvc.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     07:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Long id;
    private String firstName;
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;
}

