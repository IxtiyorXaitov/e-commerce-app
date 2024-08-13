package com.ixtiyor.product.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "product_property")
public class ProductPropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private ProductEntity product;

    @ManyToOne(optional = false)
    private ColorEntity color;

    @ManyToOne(optional = false)
    private SizeEntity size;

    @Column(name = "quantity")
    private Integer quantity;
}
