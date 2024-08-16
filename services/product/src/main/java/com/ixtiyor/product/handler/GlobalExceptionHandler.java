package com.ixtiyor.product.handler;

import com.ixtiyor.product.dto.ErrorDTO;
import com.ixtiyor.product.exception.CategoryNotFoundException;
import com.ixtiyor.product.exception.ColorNotFoundException;
import com.ixtiyor.product.exception.ProductNotFoundException;
import com.ixtiyor.product.exception.SizeNotFoundException;
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
                "10400",
                null,
                null,
                errors
        );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(dto);
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ErrorDTO> handle(CategoryNotFoundException ex) {

        ErrorDTO dto = new ErrorDTO(
                "10400",
                ex.getMessage(),
                ex.getDescription(),
                null
        );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(dto);
    }

    @ExceptionHandler(ColorNotFoundException.class)
    public ResponseEntity<ErrorDTO> handle(ColorNotFoundException ex) {

        ErrorDTO dto = new ErrorDTO(
                "10400",
                ex.getMessage(),
                ex.getDescription(),
                null
        );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(dto);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorDTO> handle(ProductNotFoundException ex) {

        ErrorDTO dto = new ErrorDTO(
                "10400",
                ex.getMessage(),
                ex.getDescription(),
                null
        );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(dto);
    }

    @ExceptionHandler(SizeNotFoundException.class)
    public ResponseEntity<ErrorDTO> handle(SizeNotFoundException ex) {

        ErrorDTO dto = new ErrorDTO(
                "10400",
                ex.getMessage(),
                ex.getDescription(),
                null
        );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(dto);
    }
}
