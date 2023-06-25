package com.demo.application.user;

import com.demo.domainuser.UserService;

public class UserApplicationService {

    private final UserService userService;

    public UserApplicationService(UserService userService) {
        this.userService = userService;
    }

    public void registerUser(String name, String password) {
        userService.register(name, password);
    }
}
