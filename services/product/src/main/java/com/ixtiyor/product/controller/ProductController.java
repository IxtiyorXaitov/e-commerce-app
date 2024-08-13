package com.ixtiyor.product.controller;

import com.ixtiyor.product.dto.product.ProductAddDTO;
import com.ixtiyor.product.dto.product.ProductDTO;
import com.ixtiyor.product.dto.product.ProductEditDTO;
import com.ixtiyor.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> create(
            @RequestBody ProductAddDTO dto
    ) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> create(
            @PathVariable Long id,
            @RequestBody ProductEditDTO dto
    ) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> get(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> getAll(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getAll(page, size));
    }
}
