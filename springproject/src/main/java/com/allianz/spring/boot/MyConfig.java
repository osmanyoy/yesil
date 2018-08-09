package com.allianz.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:my.properties")
public class MyConfig {

    @Bean
    public MyProperties myProperties() {
        return new MyProperties();
    }
}
