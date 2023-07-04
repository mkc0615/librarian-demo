package com.demo.presentationrest.model;

import java.util.List;

public class ErrorResponse {

    public static class Fail {
        private Error error;

        public Fail(Error error) {
            this.error = error;
        }

        public static Fail create(String code, String exceptionName, String message) {
            return new Fail(new Error(code, exceptionName, message));
        }
    }

    public static class ValidationFail {
        private ValidationError error;

        public ValidationFail(ValidationError error) {
            this.error = error;
        }

        public static ValidationFail create(String message, List<ErrorDetail> errors) {
            return new ValidationFail(new ValidationError(message, errors));
        }

        public ValidationError getError() {
            return error;
        }
    }

    public static class Error{
        private String code;
        private String name;
        private String message;

        public Error(String code, String name, String message) {
            this.code = code;
            this.name = name;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getMessage() {
            return message;
        }
    }

    public static class ValidationError {
        private String code;
        private String name;
        private String message;
        private List<ErrorDetail> details;

        public ValidationError(String message, List<ErrorDetail> details) {
            this.message = message;
            this.details = details;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getMessage() {
            return message;
        }

        public List<ErrorDetail> getDetails() {
            return details;
        }
    }

    public static class ErrorDetail {
        private String code;
        private String field;
        private String message;

        public ErrorDetail(String code, String field, String message) {
            this.code = code;
            this.field = field;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getField() {
            return field;
        }

        public String getMessage() {
            return message;
        }
    }
}
