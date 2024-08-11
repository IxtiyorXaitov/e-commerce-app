package com.ixtiyor.customer.dto;

import com.ixtiyor.customer.entity.Address;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CustomerAddDTO(
        @NotNull(message = "firstname is must not be null")
        String firstname,
        @NotNull(message = "lastname is must not be null")
        String lastname,
        LocalDate birthDate,
        Address address
) {
}
