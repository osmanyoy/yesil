package com.allianz.spring.boot;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity httpParam) throws Exception {
        httpParam.csrf()
                 .disable()
                 .authorizeRequests()
                 .antMatchers("/admin/**")
                 .hasRole("ADMIN")
                 .antMatchers("/**")
                 .authenticated()
                 .and()
                 .httpBasic()
                 .and()
                 .cors()
                 .disable();
    }
}
