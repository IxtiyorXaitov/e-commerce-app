package com.ixtiyor.product.mapper;

import com.ixtiyor.product.dto.size.SizeAddDTO;
import com.ixtiyor.product.dto.size.SizeDTO;
import com.ixtiyor.product.dto.size.SizeEditDTO;
import com.ixtiyor.product.entity.SizeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface SizeMapper {

    SizeEntity mapToEntity(SizeAddDTO dto);

    SizeEntity mapToEntity(SizeEditDTO dto);

    SizeDTO mapToDTO(SizeEntity entity);

    void update(@MappingTarget SizeEntity entity, SizeEditDTO dto);


}
