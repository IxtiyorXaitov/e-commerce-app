package com.ixtiyor.product.dto.color;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorDTO {
    private Long id;
    private String name;
    private String code;
}
