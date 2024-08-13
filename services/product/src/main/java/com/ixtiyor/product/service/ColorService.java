package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.color.ColorAddDTO;
import com.ixtiyor.product.dto.color.ColorDTO;
import com.ixtiyor.product.dto.color.ColorEditDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ColorService {
    public ColorDTO create(ColorAddDTO dto) {
        return null;
    }

    public ColorDTO update(Long id, ColorEditDTO dto) {
        return null;
    }

    public ColorDTO get(Long id) {
        return null;
    }

    public Page<ColorDTO> getAll(Integer page, Integer size) {
        return null;
    }
}
