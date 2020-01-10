package mvc.api.v1.mapper;

import mvc.api.v1.model.CategoryDTO;
import mvc.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Author:   Okan Hollander
 * Date:     07/01/2020
 * Time:     15:48
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
