package com.allianz.spring.boot.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class MySecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity httpParam) throws Exception {
        httpParam.csrf()
                 .disable()
                 .authorizeRequests()
                 .antMatchers("/customer/**",
                              "/actuator/**")
                 .anonymous()
                 .antMatchers(HttpMethod.POST,
                              "/customer/**")
                 .permitAll()
                 .antMatchers("/**")
                 .authenticated()
                 .antMatchers("/xyz/**")
                 .hasRole("YONETICI")
                 .and()
                 .httpBasic()
                 .and()
                 .cors()
                 .disable();
    }
}
