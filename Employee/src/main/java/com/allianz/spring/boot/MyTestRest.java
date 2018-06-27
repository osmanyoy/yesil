package com.allianz.spring.boot;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MyTestRest {

    @GetMapping("/hello1")
    @PreAuthorize("hasRole('KOLELER')")
    public String hello1() {
        return "hello1";
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasRole('YONETICILER')")
    public String hello2() {
        return "hello2";
    }

}
