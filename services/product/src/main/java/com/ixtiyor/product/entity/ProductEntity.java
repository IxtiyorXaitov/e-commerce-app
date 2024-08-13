package com.ixtiyor.product.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "discount")
    private BigDecimal discount;

    @Column(name = "image_id")
    private Long imageId;

    @ManyToOne(optional = false)
    private CategoryEntity category;

}
