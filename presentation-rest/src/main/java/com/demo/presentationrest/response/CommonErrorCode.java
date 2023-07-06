package com.demo.presentationrest.response;

public enum CommonErrorCode implements ErrorCode {
    INVALID_JSON("E0001", "잘못된 요청입니다."),
    INVALID_REQUEST("E0002", "잘못된 요청값입니다."),
    INTERNAL_SERVER_EXCEPTION("E0003", "잘못된 요청입니다.");

    private final String code;
    private final String message;

    CommonErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
