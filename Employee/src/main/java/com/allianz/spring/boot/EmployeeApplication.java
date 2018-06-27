package com.allianz.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class EmployeeApplication {

    public static void main(final String[] args) {
        SpringApplication.run(EmployeeApplication.class,
                              args);
    }
}
