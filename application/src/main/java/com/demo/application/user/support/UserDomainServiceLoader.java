package com.demo.application.user.support;

import com.demo.domainuser.UserProvider;
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

    @Bean
    public UserProvider userProvider(UserRepository userRepository) {
        return new UserProvider(userRepository);
    }
}
