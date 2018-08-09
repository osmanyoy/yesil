package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyRest {

    @Autowired
    private MyProperties myProp;

    @GetMapping("/prop")
    public MyProperties getProperties() {
        return this.myProp;
    }

}
