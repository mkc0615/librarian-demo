package com.demo.application.user;

import com.demo.application.user.model.UserModel;
import com.demo.domainuser.User;
import com.demo.domainuser.UserProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class UserApplicationProvider {

    private final UserProvider userProvider;

    public UserApplicationProvider(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public UserModel getUser(String name, String password){
        return UserModel.from(userProvider.findUser(name, password));
    }

    public List<UserModel> getUsers() {
        return userProvider.findUsers()
                .stream()
                .map(UserModel::from)
                .collect(Collectors.toList());
    }
}
