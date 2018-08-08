package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    @Qualifier("cm1")
    public CustomerManager myCustomerManager() {
        return new CustomerManager();
    }

}
