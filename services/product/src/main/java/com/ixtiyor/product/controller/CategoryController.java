package com.ixtiyor.product.controller;

import com.ixtiyor.product.dto.category.CategoryAddDTO;
import com.ixtiyor.product.dto.category.CategoryDTO;
import com.ixtiyor.product.dto.category.CategoryEditDTO;
import com.ixtiyor.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @PostMapping
    public ResponseEntity<CategoryDTO> create(
            @RequestBody CategoryAddDTO dto
    ) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDTO> create(
            @PathVariable Long id,
            @RequestBody CategoryEditDTO dto
    ) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> get(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<Page<CategoryDTO>> getAll(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getAll(page, size));
    }
}
