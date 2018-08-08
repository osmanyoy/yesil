package com.allianz.spring.boot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyNewClass {

    private String myName;
    private String mySurname;


    public MyNewClass() {
        System.out.println("MyNewClass cosntructor");
    }

    public String getMyName() {
        return this.myName;
    }

    public void setMyName(final String myNameParam) {
        this.myName = myNameParam;
    }

    public String getMySurname() {
        return this.mySurname;
    }

    public void setMySurname(final String mySurnameParam) {
        this.mySurname = mySurnameParam;
    }


}
