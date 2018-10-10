package com.allianz.spring.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder ben;

    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        return User.builder()
                   .username(usernameParam)
                   .password(this.ben.encode("1234"))
                   .roles("YONTICI")
                   .build();
    }

}
