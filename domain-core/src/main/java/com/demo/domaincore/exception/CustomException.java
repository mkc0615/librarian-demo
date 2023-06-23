package com.demo.domaincore.exception;

public class CustomException extends RuntimeException {
    private final String errorMessage;
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode, Throwable cause) {
        this(
            CommonErrorCode.INTERNAL_SERVER_EXCEPTION.getMessage(),
            errorCode,
            cause
        );
    }

    public CustomException(String errorMessage, ErrorCode errorCode, Throwable cause) {
        super(errorMessage, cause);
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
