package com.ixtiyor.product.mapper;

import com.ixtiyor.product.dto.category.CategoryAddDTO;
import com.ixtiyor.product.dto.category.CategoryDTO;
import com.ixtiyor.product.dto.category.CategoryEditDTO;
import com.ixtiyor.product.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface CategoryMapper {

    CategoryEntity mapToEntity(CategoryAddDTO dto);

    CategoryEntity mapToEntity(CategoryEditDTO dto);

    CategoryDTO mapToDTO(CategoryEntity entity);

    void update(@MappingTarget CategoryEntity entity, CategoryEditDTO dto);

}
