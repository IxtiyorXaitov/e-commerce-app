package com.ixtiyor.customer.service;

import com.ixtiyor.customer.dto.CustomerAddDTO;
import com.ixtiyor.customer.dto.CustomerDTO;
import com.ixtiyor.customer.entity.CustomerEntity;
import com.ixtiyor.customer.exception.CustomerNotFoundException;
import com.ixtiyor.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerDTO create(CustomerAddDTO dto) {
        CustomerEntity entity = new CustomerEntity(
                UUID.randomUUID().toString(),
                dto.firstname(),
                dto.lastname(),
                dto.birthDate(),
                dto.address()
        );
        repository.save(entity);
        return new CustomerDTO(
                entity.getId(),
                entity.getFirstname(),
                entity.getLastname(),
                entity.getBirthDate(),
                entity.getAddress()
        );
    }

    public CustomerDTO update(String id, CustomerDTO dto) {
        CustomerEntity entity = findCustomerById(id);
        entity.setFirstname(dto.firstname());
        entity.setLastname(dto.lastname());
        entity.setBirthDate(dto.birthDate());
        entity.setAddress(dto.address());

        repository.save(entity);
        return new CustomerDTO(
                entity.getId(),
                entity.getFirstname(),
                entity.getLastname(),
                entity.getBirthDate(),
                entity.getAddress()
        );
    }

    public Page<CustomerDTO> findAll(Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository
                .findAll(pageRequest)
                .map(item ->
                        new CustomerDTO(
                                item.getId(),
                                item.getFirstname(),
                                item.getLastname(),
                                item.getBirthDate(),
                                item.getAddress()
                        )
                );
    }

    public CustomerDTO findById(String id) {
        CustomerEntity entity = findCustomerById(id);
        return new CustomerDTO(
                entity.getId(),
                entity.getFirstname(),
                entity.getLastname(),
                entity.getBirthDate(),
                entity.getAddress()
        );
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public CustomerDTO checkExists(String id) {
        return null;
    }

    private CustomerEntity findCustomerById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }

}
