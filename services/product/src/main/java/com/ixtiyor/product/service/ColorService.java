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
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorRepository repository;
    private final ColorMapper mapper;

    public ColorDTO create(ColorAddDTO dto) {
        log.info("dto: {}", dto);
        ColorEntity entity = mapper.mapToEntity(dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public ColorDTO update(Long id, ColorEditDTO dto) {
        log.info("id: {} dto: {}", id, dto);
        ColorEntity entity = findColorById(id);
        return null;
    }

    public ColorDTO get(Long id) {
        log.info("id: {}", id);
        ColorEntity entity = findColorById(id);
        return mapper.mapToDTO(entity);
    }

    public Page<ColorDTO> getAll(Integer page, Integer size) {
        log.info("page: {} size: {}", page, size);
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAll(pageRequest).map(mapper::mapToDTO);
    }

    private ColorEntity findColorById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ColorNotFoundException(id));
    }
}
