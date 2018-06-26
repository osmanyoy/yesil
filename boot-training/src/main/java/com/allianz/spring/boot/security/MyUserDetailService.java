package com.allianz.spring.boot.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class MyUserDetailService implements UserDetailsService {

    private final Map<String, UserObj> userMap = new HashMap<>();

    @Autowired
    private BCryptPasswordEncoder      bCryptPasswordEncoder;

    public MyUserDetailService() {
    }

    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        UserObj userLoc = this.userMap.get(usernameParam);
        if (userLoc == null) {
            throw new UsernameNotFoundException("User yok");
        }
        return User.builder()
                   .username(userLoc.getUsername())
                   .password(this.bCryptPasswordEncoder.encode(userLoc.getPassword()))
                   .roles(userLoc.getRole())
                   .build();
    }

    public void addUser(final UserObj user) {
        this.userMap.put(user.getUsername(),
                         user);
    }

}
