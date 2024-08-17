package com.ixtiyor.product.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryAddDTO {
    private String name;
    private String description;
    private Long parentId;
}
