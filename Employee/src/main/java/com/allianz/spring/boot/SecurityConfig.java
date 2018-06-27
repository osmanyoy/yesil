package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@PropertySource("classpath:security.properties")
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder myEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public MyUserDetailService userDetailService() {
        MyUserDetailService detailServiceLoc = new MyUserDetailService();

        return detailServiceLoc;
    }

    @Autowired
    public void initSecurity(final AuthenticationManagerBuilder builderParam) {
        try {
            BCryptPasswordEncoder myEncoderLoc = this.myEncoder();
            MyUserDetailService userDetailServiceLoc = this.userDetailService();
            builderParam.userDetailsService(userDetailServiceLoc)
                        .passwordEncoder(myEncoderLoc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
