package com.demo.application.user.support;

import com.demo.domainuser.UserRepository;
import com.demo.domainuser.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDomainServiceLoader {
    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
