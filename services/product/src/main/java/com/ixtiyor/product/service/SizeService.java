package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.size.SizeAddDTO;
import com.ixtiyor.product.dto.size.SizeDTO;
import com.ixtiyor.product.dto.size.SizeEditDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SizeService {
    public SizeDTO create(SizeAddDTO dto) {
        return null;
    }

    public SizeDTO update(Long id, SizeEditDTO dto) {
        return null;
    }

    public SizeDTO get(Long id) {
        return null;
    }

    public Page<SizeDTO> getAll(Integer page, Integer size) {
        return null;
    }
}
