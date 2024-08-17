package com.ixtiyor.product.exception;

public class ProductNotFoundException extends BaseException {
    public ProductNotFoundException(Long id) {
        super("product.not.found.exception.message", "product.not.found.exception.description", "P404", id);
    }
}
