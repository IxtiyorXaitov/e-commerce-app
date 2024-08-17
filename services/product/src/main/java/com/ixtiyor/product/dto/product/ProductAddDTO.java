package com.ixtiyor.product.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductAddDTO {
    private String name;
    private String description;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal discount;
    private Long imageId;
    private Long categoryId;
}
