package com.demo.application.user.model;

import com.demo.domainuser.User;

import java.io.Serializable;

public class UserModel implements Serializable {
    private final String name;
    private final String phoneNumber;
    private final String address;
    private final String zipCode;

    private UserModel(String name, String phoneNumber, String address, String zipCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.zipCode = zipCode;
    }

    public static UserModel from(User user) {
        return new UserModel(user.getName(), user.getPhoneNumber(), user.getAddress(), user.getZipCode());
    }

    public String getName() {
        return name;
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
