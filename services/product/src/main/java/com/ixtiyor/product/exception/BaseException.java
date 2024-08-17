package com.ixtiyor.product.exception;

import com.ixtiyor.product.configuration.MessageUtil;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {
    private final String code;
    private final String message;
    private final String description;

    public BaseException(String message, String description, String code, Object... variable) {
        super(MessageUtil.getMessage(message, variable));
        this.code = code;
        this.message = MessageUtil.getMessage(message, variable);
        this.description = MessageUtil.getMessage(description);
    }
}
