package com.ixtiyor.product.mapper;

import com.ixtiyor.product.dto.color.ColorAddDTO;
import com.ixtiyor.product.dto.color.ColorDTO;
import com.ixtiyor.product.dto.color.ColorEditDTO;
import com.ixtiyor.product.entity.ColorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface ColorMapper {

    ColorEntity mapToEntity(ColorAddDTO dto);

    ColorEntity mapToEntity(ColorEditDTO dto);

    ColorDTO mapToDTO(ColorEntity entity);

    void update(@MappingTarget ColorEntity entity, ColorEditDTO dto);

}
