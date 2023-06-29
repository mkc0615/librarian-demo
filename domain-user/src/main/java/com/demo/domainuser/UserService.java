package com.demo.domainuser;

import com.demo.domaincore.model.UUIDGenerator;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void register(String name, String password) {
        User user = userRepository.findUser(name, password);
        if(user == null){
            user = User.create(name, password);
        }
        userRepository.save(user.searched());
    }
}
