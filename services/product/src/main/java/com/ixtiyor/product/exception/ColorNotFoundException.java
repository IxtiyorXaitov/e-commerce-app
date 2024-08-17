package com.ixtiyor.product.exception;

public class ColorNotFoundException extends BaseException {
    public ColorNotFoundException(Long id) {
        super("color.not.found.exception.message", "color.not.found.exception.description", "C404", id);
    }
}
