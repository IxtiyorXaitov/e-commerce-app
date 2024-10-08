package com.ixtiyor.customer.dto;

import java.util.Map;

public record ErrorDTO(
        String code,
        String message,
        String description,
        Map<String, Object> detail
) {
}
