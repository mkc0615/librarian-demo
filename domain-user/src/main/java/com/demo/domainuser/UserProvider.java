package com.demo.domainuser;

import java.util.List;

public class UserProvider {
    private final UserRepository userRepository;
    public UserProvider(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User findUser(String name, String password) {
        return userRepository.findUser(name, password);
    }
    public List<User> findUsers(){
        return userRepository.findUsers();
    }
}
