package com.demo.domaincore.exception;

public enum CommonErrorCode implements ErrorCode {

    INVALID_REQUEST("B0001", "잘못된 요청입니다."),
    INTERNAL_SERVER_EXCEPTION("B0003", "서버 오류가 발생했습니다.");

    private final String code;
    private final String message;

    CommonErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }
}

