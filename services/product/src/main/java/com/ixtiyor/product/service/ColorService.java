package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.color.ColorAddDTO;
import com.ixtiyor.product.dto.color.ColorDTO;
import com.ixtiyor.product.dto.color.ColorEditDTO;
import com.ixtiyor.product.entity.ColorEntity;
import com.ixtiyor.product.exception.ColorNotFoundException;
import com.ixtiyor.product.mapper.ColorMapper;
import com.ixtiyor.product.repository.ColorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorRepository repository;
    private final ColorMapper mapper;

    public ColorDTO create(ColorAddDTO dto) {
        ColorEntity entity = mapper.mapToEntity(dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public ColorDTO update(Long id, ColorEditDTO dto) {
        ColorEntity entity = findColorById(id);
        return null;
    }

    public ColorDTO get(Long id) {
        ColorEntity entity = findColorById(id);
        return mapper.mapToDTO(entity);
    }

    public Page<ColorDTO> getAll(Integer page, Integer size) {
        return null;
    }

    private ColorEntity findColorById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ColorNotFoundException(String.format("Color not found with this id: %d", id)));
    }
}
