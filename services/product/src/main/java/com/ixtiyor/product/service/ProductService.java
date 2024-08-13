package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.product.ProductAddDTO;
import com.ixtiyor.product.dto.product.ProductDTO;
import com.ixtiyor.product.dto.product.ProductEditDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    public ProductDTO create(ProductAddDTO dto) {
        return null;
    }

    public ProductDTO update(Long id, ProductEditDTO dto) {
        return null;
    }

    public ProductDTO get(Long id) {
        return null;
    }

    public Page<ProductDTO> getAll(Integer page, Integer size) {
        return null;
    }
}
