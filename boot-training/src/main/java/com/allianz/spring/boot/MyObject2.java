package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ikinci")
public class MyObject2 implements IMyInterface {

    @Override
    public String execute(final String name,
                          final String surname,
                          final int age) {
        return "Mutlu " + name + " " + surname + ". " + age + ".inci yaş gününüz mutlu olsun";
    }

}
