package com.allianz.spring.boot;

import org.springframework.stereotype.Service;

@Service
public class MyObject3 implements IMyInterface {

    @Override
    public String execute(final String name,
                          final String surname,
                          final int age) {
        return "Kutlu " + name + " " + surname + ". " + age + ".inci yaş gününüz mutlu olsun";
    }

}
