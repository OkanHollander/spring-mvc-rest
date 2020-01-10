package mvc.api.v1.mapper;


import mvc.api.v1.model.CategoryDTO;
import mvc.domain.Category;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     15:56
 */
public class CategoryMapperTest {

    public static final String NAME = "Joe";
    public static final long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() throws Exception {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }
}
