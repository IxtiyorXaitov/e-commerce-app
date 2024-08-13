package com.ixtiyor.product.controller;

import com.ixtiyor.product.dto.size.SizeAddDTO;
import com.ixtiyor.product.dto.size.SizeDTO;
import com.ixtiyor.product.dto.size.SizeEditDTO;
import com.ixtiyor.product.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/size")
@RequiredArgsConstructor
public class SizeController {

    private final SizeService service;

    @PostMapping
    public ResponseEntity<SizeDTO> create(
            @RequestBody SizeAddDTO dto
    ) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SizeDTO> create(
            @PathVariable Long id,
            @RequestBody SizeEditDTO dto
    ) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SizeDTO> get(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<Page<SizeDTO>> getAll(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getAll(page, size));
    }
}
