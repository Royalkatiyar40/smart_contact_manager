package com.scm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    //user create and login using java code with  with sql serivces or memory
    //using spring security 
    @Bean
    public UserDetailsService userDetailsService(){
        @SuppressWarnings("deprecation")
        UserDetails user1 = User
       .withDefaultPasswordEncoder()
       .username("admin123")
       .password("admin123")
    //    .role("ADMIN","USER") 
       .build();

        var inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1);
        return inMemoryUserDetailsManager;
    }
}
