package com.allianz.spring.boot;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AfterStartup implements CommandLineRunner {

    @Autowired
    private IMyObjectDAO myDAO;

    @Override
    public void run(final String... argsParam) throws Exception {
        MyObject myObjectLoc = new MyObject();
        myObjectLoc.setUserName("osman");
        Random randomLoc = new Random();
        myObjectLoc.setTestVal(randomLoc.nextInt());

        this.myDAO.save(myObjectLoc);
    }

}
