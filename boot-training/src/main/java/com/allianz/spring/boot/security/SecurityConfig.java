package com.allianz.spring.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder myEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public MyUserDetailService userDetailService() {
        MyUserDetailService detailServiceLoc = new MyUserDetailService();
        detailServiceLoc.addUser(new UserObj("osman1",
                                             "1234",
                                             "YONETICI1"));
        detailServiceLoc.addUser(new UserObj("osman2",
                                             "1234",
                                             "YONETICI2"));
        detailServiceLoc.addUser(new UserObj("osman3",
                                             "1234",
                                             "YONETICI3"));
        detailServiceLoc.addUser(new UserObj("osman4",
                                             "1234",
                                             "YONETICI4"));
        detailServiceLoc.addUser(new UserObj("osman5",
                                             "1234",
                                             "YONETICI5"));
        detailServiceLoc.addUser(new UserObj("osman6",
                                             "1234",
                                             "YONETICI6"));
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

    //@Autowired
    public void initSecurity2(final AuthenticationManagerBuilder builderParam) {
        try {
            BCryptPasswordEncoder myEncoderLoc = this.myEncoder();

            builderParam.inMemoryAuthentication()
                        .passwordEncoder(myEncoderLoc)
                        .withUser("osman")
                        .password(myEncoderLoc.encode("1234"))
                        .roles("YONETICI")
                        .and()
                        .withUser("ali")
                        .password(myEncoderLoc.encode("1234"))
                        .roles("KULLANICI");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
