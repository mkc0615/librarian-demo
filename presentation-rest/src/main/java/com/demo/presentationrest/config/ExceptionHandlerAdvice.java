package com.demo.presentationrest.config;

import com.demo.presentationrest.response.CommonErrorCode;
import com.demo.presentationrest.response.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.demo.library.presentation")
public class ExceptionHandlerAdvice {

    private final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse.Fail methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        logger.error(exception.getMessage());
        return ErrorResponse.Fail.create(
                CommonErrorCode.INVALID_REQUEST.getCode(),
                exception.getClass().getSimpleName(),
                CommonErrorCode.INVALID_REQUEST.getMessage()
        );
    }
}
