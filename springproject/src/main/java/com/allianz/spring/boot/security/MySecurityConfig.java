package com.allianz.spring.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class MySecurityConfig {

    @Bean
    public BCryptPasswordEncoder passEncode() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public MyUserDetailService myUserDetailService() {
        return new MyUserDetailService();
    }

    @Autowired
    public void configureAuth(final AuthenticationManagerBuilder authenticationManagerBuilderParam) {
        try {
            authenticationManagerBuilderParam.userDetailsService(this.myUserDetailService())
                                             .passwordEncoder(this.passEncode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
