package com.demo.application.user.model;

import com.demo.domainuser.User;

import java.io.Serializable;

public class UserModel implements Serializable {

    private final String name;
    private final String password;

    private UserModel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static UserModel from(User user) {
        return new UserModel(user.getName(), user.getPassword());
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
