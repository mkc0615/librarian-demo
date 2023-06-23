package com.demo.domaincore.exception;

public class ErrorDetail {
    private final String field;
    private final String value;
    private final String reason;

    public ErrorDetail(String field, String value, String reason) {
        this.field = field;
        this.value = value;
        this.reason = reason;
    }

    public String getField() {
        return field;
    }

    public String getValue() {
        return value;
    }

    public String getReason() {
        return reason;
    }
}
