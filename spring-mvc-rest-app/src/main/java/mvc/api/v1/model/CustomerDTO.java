package mvc.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "This is the first name", required = true)
    private String firstName;
    @ApiModelProperty(value = "This is the last name", required = true)
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;
}

