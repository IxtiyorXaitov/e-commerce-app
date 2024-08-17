package com.ixtiyor.product.service;

import com.ixtiyor.product.dto.size.SizeAddDTO;
import com.ixtiyor.product.dto.size.SizeDTO;
import com.ixtiyor.product.dto.size.SizeEditDTO;
import com.ixtiyor.product.entity.SizeEntity;
import com.ixtiyor.product.exception.SizeNotFoundException;
import com.ixtiyor.product.mapper.SizeMapper;
import com.ixtiyor.product.repository.SizeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SizeService {

    private final SizeRepository repository;
    private final SizeMapper mapper;

    public SizeDTO create(SizeAddDTO dto) {
        log.info("dto: {}", dto);
        SizeEntity entity = mapper.mapToEntity(dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public SizeDTO update(Long id, SizeEditDTO dto) {
        log.info("id: {} dto: {}", id, dto);
        SizeEntity entity = findSizeById(id);
        mapper.update(entity, dto);
        repository.save(entity);
        return mapper.mapToDTO(entity);
    }

    public SizeDTO get(Long id) {
        log.info("id: {}", id);
        SizeEntity entity = findSizeById(id);
        return mapper.mapToDTO(entity);
    }

    public Page<SizeDTO> getAll(Integer page, Integer size) {
        log.info("page: {} size: {}", page, size);
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAll(pageRequest).map(mapper::mapToDTO);
    }

    private SizeEntity findSizeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new SizeNotFoundException(id));
    }
}
