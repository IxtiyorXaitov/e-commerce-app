package com.ixtiyor.product.controller;

import com.ixtiyor.product.dto.color.ColorAddDTO;
import com.ixtiyor.product.dto.color.ColorDTO;
import com.ixtiyor.product.dto.color.ColorEditDTO;
import com.ixtiyor.product.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/color")
@RequiredArgsConstructor
public class ColorController {

    private final ColorService service;

    @PostMapping
    public ResponseEntity<ColorDTO> create(
            @RequestBody ColorAddDTO dto
    ) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ColorDTO> create(
            @PathVariable Long id,
            @RequestBody ColorEditDTO dto
    ) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ColorDTO> get(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping
    public ResponseEntity<Page<ColorDTO>> getAll(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getAll(page, size));
    }
}
