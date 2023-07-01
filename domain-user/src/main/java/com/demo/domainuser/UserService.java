package com.demo.domainuser;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void register(String name, String password) {
        User user = userRepository.findUserByNameAndPassword(name, password);
        if(user == null){
            user = User.create(name, password);
        }
        userRepository.save(user.searched());
    }
}
