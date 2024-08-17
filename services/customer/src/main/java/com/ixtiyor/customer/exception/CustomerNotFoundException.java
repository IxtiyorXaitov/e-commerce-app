package com.ixtiyor.customer.exception;

public class CustomerNotFoundException extends BaseException {
    public CustomerNotFoundException(String id) {
        super("customer.not.found.exception.message", "customer.not.found.exception.description", "C404", id);
    }
}
