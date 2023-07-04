package com.demo.presentationrest.config;

import com.demo.presentationrest.model.CommonErrorCode;
import com.demo.presentationrest.model.ErrorResponse;
import com.demo.presentationrest.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice(basePackages = "com.demo.library.presentation")
public class ExceptionHandlerAdvice {

    private final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse.Fail methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        logger.error(exception.getMessage());

        List<String> errors = exception.getBindingResult().getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.toList());

        return ErrorResponse.Fail.create(
                CommonErrorCode.INVALID_REQUEST.getCode(),
                exception.getClass().getSimpleName(),
                CommonErrorCode.INVALID_REQUEST.getMessage()
        );
    }
}
