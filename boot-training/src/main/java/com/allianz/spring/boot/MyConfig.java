package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.test.TestConfig;

@Configuration
@PropertySource("classpath:my.properties")
@Import(TestConfig.class)
public class MyConfig {

    @Bean
    @Qualifier("onemli")
    public IMyInterface createMyInterface(@Value("${my.object.index}") final int index) {
        switch (index) {
            case 1:
                return new MyObject();
            case 2:
                return new MyObject2();
            case 3:
                return new MyObject3();

            default:
                return new MyObject();
        }
    }

    @Bean
    @Qualifier("onemli")
    public IMyInterface createMyInterface(@Value("${my.object.index}") final int index) {
        switch (index) {
            case 1:
                return new MyObject();
            case 2:
                return new MyObject2();
            case 3:
                return new MyObject3();

            default:
                return new MyObject();
        }
    }

}
