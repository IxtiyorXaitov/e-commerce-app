package com.ixtiyor.customer.controller;

import com.ixtiyor.customer.dto.CustomerAddDTO;
import com.ixtiyor.customer.dto.CustomerDTO;
import com.ixtiyor.customer.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/customer")
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    public ResponseEntity<CustomerDTO> create(
            @RequestBody @Valid CustomerAddDTO dto
    ) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> update(
            @PathVariable String id,
            @RequestBody @Valid CustomerDTO dto
    ) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @GetMapping
    public ResponseEntity<Page<CustomerDTO>> findAll(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.findAll(page, size));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> findById(
            @PathVariable String id
    ) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable String id
    ) {
        service.delete(id);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/check-exits/{id}")
    public ResponseEntity<CustomerDTO> checkExists(
            @PathVariable String id
    ) {
        return ResponseEntity.ok(service.checkExists(id));
    }
}
