package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.category.CategoryAddDTO;
import com.ixtiyor.product.dto.category.CategoryDTO;
import com.ixtiyor.product.dto.category.CategoryEditDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {
    public CategoryDTO create(CategoryAddDTO dto) {
        return null;
    }

    public CategoryDTO update(Long id, CategoryEditDTO dto) {
        return null;
    }

    public CategoryDTO get(Long id) {
        return null;
    }

    public Page<CategoryDTO> getAll(Integer page, Integer size) {
        return null;
    }
}
