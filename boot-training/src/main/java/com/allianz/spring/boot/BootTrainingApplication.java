package com.allianz.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

//@SpringBootApplication(scanBasePackages = {
//                                            "com.allianz.spring.boot",
//                                            "com.test"
//})
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableConfigurationProperties
public class BootTrainingApplication {

    public static void main(final String[] args) {
        SpringApplication.run(BootTrainingApplication.class,
                              args);
    }
}
