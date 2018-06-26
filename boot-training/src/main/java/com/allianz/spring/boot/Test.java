package com.allianz.spring.boot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {

    private final IMyInterface interface1;


    @Autowired
    public Test(@Qualifier("birinci") final IMyInterface interface1) {
        this.interface1 = interface1;
    }

    @PostConstruct
    public void init() {
        this.interface1.execute("osman",
                                "yaycıoğlu",
                                40);

    }
}
