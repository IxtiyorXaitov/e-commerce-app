package com.ixtiyor.product.mapper;

import com.ixtiyor.product.dto.product.ProductAddDTO;
import com.ixtiyor.product.dto.product.ProductDTO;
import com.ixtiyor.product.dto.product.ProductEditDTO;
import com.ixtiyor.product.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    ProductEntity mapToEntity(ProductAddDTO dto);

    ProductEntity mapToEntity(ProductEditDTO dto);

    ProductDTO mapToDTO(ProductEntity entity);

}
