package com.allianz.spring.boot.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyConfigRunner implements CommandLineRunner {

    @Autowired
    private MyConfigProb mConfigProb;

    @Override
    public void run(final String... argsParam) throws Exception {
        System.out.println("Config : " + this.mConfigProb);

    }

}
