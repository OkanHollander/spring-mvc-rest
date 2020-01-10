package mvc.services;

import mvc.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     19:30
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
    
}
