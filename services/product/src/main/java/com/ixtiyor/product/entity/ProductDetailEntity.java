package com.ixtiyor.product.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "product_detail")
public class ProductDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private ProductEntity product;

    @Column(name = "content")
    private String content;
}
