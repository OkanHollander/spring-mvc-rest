package mvc.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Author:   Okan Hollander
 * Date:     08/01/2020
 * Time:     08:42
 */
public abstract class AbstractRestController {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
