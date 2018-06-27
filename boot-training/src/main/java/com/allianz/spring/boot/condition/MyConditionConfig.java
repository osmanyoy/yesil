package com.allianz.spring.boot.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.allianz.spring.boot.IMyInterface;
import com.allianz.spring.boot.MyObject;
import com.allianz.spring.boot.MyObject2;
import com.allianz.spring.boot.MyObject3;

@Configuration
public class MyConditionConfig {

    @Profile("canli")
    @TestCondition(abs = "LIVE")
    @Bean
    @Qualifier("con1")
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

    @Profile("cansiz")
    @TestCondition(abs = "DEBUG")
    @Bean
    @Qualifier("con1")
    public IMyInterface createMyInterface2(@Value("#{myTestBean.getIndex()}") final int index) {
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
