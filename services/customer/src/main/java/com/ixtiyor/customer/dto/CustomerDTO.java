package com.ixtiyor.customer.dto;

import com.ixtiyor.customer.entity.Address;

import java.time.LocalDate;

public record CustomerDTO(
        String id,
        String firstname,
        String lastname,
        LocalDate birthDate,
        Address address
) {
}
