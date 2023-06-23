package com.demo.domaincore.exception;

import java.util.List;

public class ValidationException extends CustomException {
    private final List<ErrorDetail> errors;

    public ValidationException() {
        super(CommonErrorCode.INVALID_REQUEST.getMessage(), CommonErrorCode.INVALID_REQUEST, null);
        this.errors = List.of();
    }

    public ValidationException(List<ErrorDetail> errors) {
        super(CommonErrorCode.INVALID_REQUEST.getMessage(), CommonErrorCode.INVALID_REQUEST, null);
        this.errors = errors;
    }

    public ValidationException(String errorMessage, ErrorCode errorCode, List<ErrorDetail> errors) {
        super(errorMessage, errorCode, null);
        this.errors = errors;
    }

    public ValidationException(String errorMessage, ErrorCode errorCode, Throwable cause, List<ErrorDetail> errors) {
        super(errorMessage, errorCode, cause);
        this.errors = errors;
    }

    public List<ErrorDetail> getErrors() {
        return errors;
    }
}
