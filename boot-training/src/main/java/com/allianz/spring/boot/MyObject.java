package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Qualifier("birinci")
public class MyObject implements IMyInterface {

    @Override
    public String execute(final String name,
                          final String surname,
                          final int age) {
        return "Sevgili " + name + " " + surname + ". " + age + ".inci yaş gününüz mutlu olsun";
    }

}
