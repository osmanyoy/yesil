package com.allianz.spring.boot.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:customer.properties")
public class CustomerConfiguration {

    @Bean
    @Qualifier("cm1")
    public CustomerManager myCustomerManager() {
        return new CustomerManager();
    }

    @Bean
    public CustomerProperties customerProperties() {
        return new CustomerProperties();
    }

    @Bean
    public CustomerPropertyReaderDAO customerPropertyReaderDAO() {
        return new CustomerPropertyReaderDAO();
    }

}
