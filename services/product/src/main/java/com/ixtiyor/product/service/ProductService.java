package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.product.ProductAddDTO;
import com.ixtiyor.product.dto.product.ProductDTO;
import com.ixtiyor.product.dto.product.ProductEditDTO;
import com.ixtiyor.product.entity.ProductEntity;
import com.ixtiyor.product.exception.ProductNotFoundException;
import com.ixtiyor.product.mapper.ProductMapper;
import com.ixtiyor.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductDTO create(ProductAddDTO dto) {
        ProductEntity entity = mapper.mapToEntity(dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public ProductDTO update(Long id, ProductEditDTO dto) {
        ProductEntity entity = findProductById(id);
        return null;
    }

    public ProductDTO get(Long id) {
        ProductEntity entity = findProductById(id);
        return mapper.mapToDTO(entity);
    }

    public Page<ProductDTO> getAll(Integer page, Integer size) {
        return null;
    }

    private ProductEntity findProductById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(String.format("Product not found with this id: %d", id)));
    }
}
