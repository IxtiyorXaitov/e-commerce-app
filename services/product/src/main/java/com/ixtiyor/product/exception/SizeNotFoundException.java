package com.ixtiyor.product.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SizeNotFoundException extends RuntimeException {
    private final String message;
}
