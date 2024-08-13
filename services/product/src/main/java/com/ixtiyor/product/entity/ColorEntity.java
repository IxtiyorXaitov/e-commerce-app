package com.ixtiyor.product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "color")
public class ColorEntity {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

}
