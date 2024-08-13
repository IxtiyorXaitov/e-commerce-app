package com.ixtiyor.product.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity(name = "product_image")
public class ProductImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "index")
    private Double index;
}
