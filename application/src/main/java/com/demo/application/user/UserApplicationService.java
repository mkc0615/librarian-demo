package com.demo.application.user;

import com.demo.domainuser.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserApplicationService {

    private final UserService userService;

    public UserApplicationService(UserService userService) {
        this.userService = userService;
    }

    public void registerUser(String name, String password, String phoneNumber, String address, String zipCode) {
        userService.register(name, password, phoneNumber, address, zipCode);
    }
}
