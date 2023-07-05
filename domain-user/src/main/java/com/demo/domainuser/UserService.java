package com.demo.domainuser;

public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void register(String name, String password, String phoneNumber, String address, String zipCode) {
        User user = userRepository.findUserByNameAndPassword(name, password);
        if(user == null){
            user = User.create(name, password, phoneNumber, address, zipCode);
        }
        userRepository.save(user.searched());
    }
}
