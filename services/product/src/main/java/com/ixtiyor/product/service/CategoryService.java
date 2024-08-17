package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.category.CategoryAddDTO;
import com.ixtiyor.product.dto.category.CategoryDTO;
import com.ixtiyor.product.dto.category.CategoryEditDTO;
import com.ixtiyor.product.entity.CategoryEntity;
import com.ixtiyor.product.exception.CategoryNotFoundException;
import com.ixtiyor.product.mapper.CategoryMapper;
import com.ixtiyor.product.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public CategoryDTO create(CategoryAddDTO dto) {
        log.info("dto: {}", dto);
        CategoryEntity entity = mapper.mapToEntity(dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public CategoryDTO update(Long id, CategoryEditDTO dto) {
        log.info("id: {} dto: {}", id, dto);
        CategoryEntity entity = findCategoryById(id);
        mapper.update(entity, dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public CategoryDTO get(Long id) {
        log.info("id: {}", id);
        CategoryEntity entity = findCategoryById(id);
        return mapper.mapToDTO(entity);
    }

    public Page<CategoryDTO> getAll(Integer page, Integer size) {
        log.info("page: {} size: {}", page, size);
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAll(pageRequest).map(mapper::mapToDTO);
    }

    private CategoryEntity findCategoryById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException(id));
    }
}
