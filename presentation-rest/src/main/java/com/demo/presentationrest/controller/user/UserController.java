package com.demo.presentationrest.controller.user;

import com.demo.application.user.UserApplicationProvider;
import com.demo.application.user.UserApplicationService;
import com.demo.application.user.model.UserModel;
import com.demo.presentationrest.controller.user.model.UserParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserApplicationProvider userApplicationProvider;

    private final UserApplicationService userApplicationService;

    public UserController(UserApplicationProvider userApplicationProvider, UserApplicationService userApplicationService) {
        this.userApplicationProvider = userApplicationProvider;
        this.userApplicationService = userApplicationService;
    }

    @GetMapping("{name}")
    public UserModel getUser(
        @PathVariable String name,
        @ModelAttribute String password
    ) {
        return userApplicationProvider.getUser(name, password);
    }

    @GetMapping
    public List<UserModel> getUsers() {
        return userApplicationProvider.getUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody UserParam param) {
        userApplicationService.registerUser(param.getName(), param.getPassword(), param.getPhoneNumber(), param.getAddress(), param.getZipCode());
    }
}
