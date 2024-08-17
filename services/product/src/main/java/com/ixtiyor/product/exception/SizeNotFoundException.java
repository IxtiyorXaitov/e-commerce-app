package com.ixtiyor.product.exception;

public class SizeNotFoundException extends BaseException {
    public SizeNotFoundException(Long id) {
        super("size.not.found.exception.message", "size.not.found.exception.description", "S404", id);
    }
}
