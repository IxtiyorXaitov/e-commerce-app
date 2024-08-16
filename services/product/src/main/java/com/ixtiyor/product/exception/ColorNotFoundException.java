package com.ixtiyor.product.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ColorNotFoundException extends RuntimeException {
    private final String message;
}
