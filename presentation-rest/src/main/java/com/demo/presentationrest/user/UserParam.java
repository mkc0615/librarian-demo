package com.demo.presentationrest.user;

import jakarta.validation.constraints.NotNull;

public class UserParam {
    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String address;
    @NotNull
    private String zipCode;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }
}
