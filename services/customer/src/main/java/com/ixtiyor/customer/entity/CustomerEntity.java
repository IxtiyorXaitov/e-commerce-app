package com.ixtiyor.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class CustomerEntity {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private Address address;

}
