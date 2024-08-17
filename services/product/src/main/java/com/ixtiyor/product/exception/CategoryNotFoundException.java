package com.ixtiyor.product.exception;

public class CategoryNotFoundException extends BaseException {
    public CategoryNotFoundException(Long id) {
        super("category.not.found.exception.message", "category.not.found.exception.description", "C404",id);
    }
}
