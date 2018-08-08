package com.allianz.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class MyLazyComponent {

    private String txtString;


    public MyLazyComponent() {
        System.out.println("MyLazyComponent ....");
    }

    public String getTxtString() {
        return this.txtString;
    }

    public void setTxtString(final String txtStringParam) {
        this.txtString = txtStringParam;
    }
}
