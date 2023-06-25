package com.demo.application.user;

import com.demo.domainuser.User;
import com.demo.domainuser.UserProvider;

import java.util.List;

public class UserApplicationProvider {

    private final UserProvider userProvider;

    public UserApplicationProvider(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public User getUser(String name, String password){
        return userProvider.findUser(name, password);
    }

    public List<User> getUsers() {
        return userProvider.findUsers();
    }
}
