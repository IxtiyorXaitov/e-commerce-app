package com.ixtiyor.customer.dto;

import java.util.Map;

public record ErrorDTO(
        Map<String, String> errors
) {
}
