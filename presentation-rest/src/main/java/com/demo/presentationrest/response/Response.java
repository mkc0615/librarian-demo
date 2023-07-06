package com.demo.presentationrest.response;

public class Response {
    public static class Success<T> {
        private T data;

        public Success(T data) {
            this.data = data;
        }

        public static <T> Success<T> of(T data) {
            return new Success<>(data);
        }

        public T getData(){
            return data;
        }
    }
}
