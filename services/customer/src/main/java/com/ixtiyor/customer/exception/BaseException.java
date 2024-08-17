package com.ixtiyor.customer.exception;

import com.ixtiyor.customer.configuration.MessageUtil;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {
    private final String code;
    private final String message;
    private final String description;

    public BaseException(String message, String description, String code, Object... variables) {
        super(MessageUtil.getMessage(message, variables));
        this.code = code;
        this.message = MessageUtil.getMessage(message, variables);
        this.description = MessageUtil.getMessage(description);
    }
}
