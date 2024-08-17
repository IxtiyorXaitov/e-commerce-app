package com.ixtiyor.customer.handler;

import com.ixtiyor.customer.dto.ErrorDTO;
import com.ixtiyor.customer.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> handle(MethodArgumentNotValidException ex) {

        var errors = new HashMap<String, Object>();

        ex.getBindingResult()
                .getAllErrors()
                .forEach(error -> {
                    var fieldName = ((FieldError) error).getField();
                    var errorMessage = error.getDefaultMessage();
                    errors.put(fieldName, errorMessage);
                });
        ErrorDTO dto = new ErrorDTO(
                "",
                null,
                null,
                errors
        );
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(dto);
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<String> handle(BaseException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }

}
