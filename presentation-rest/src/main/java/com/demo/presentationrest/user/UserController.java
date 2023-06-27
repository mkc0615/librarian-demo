package com.demo.presentationrest.user;

import com.demo.application.user.UserApplicationProvider;
import com.demo.application.user.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserApplicationProvider userApplicationProvider;

    public UserController(UserApplicationProvider userApplicationProvider) {
        this.userApplicationProvider = userApplicationProvider;
    }

    @GetMapping("{name}")
    public UserModel getUser(
        @PathVariable String name,
        @ModelAttribute String password
    ){
        return userApplicationProvider.getUser(name, password);
    }
}
