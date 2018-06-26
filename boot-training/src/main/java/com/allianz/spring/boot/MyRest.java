package com.allianz.spring.boot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.MyTestBean;

@RestController
@RequestMapping("/rest")
@Validated
public class MyRest {

    @Autowired
    private MyTestBean   testBean;

    @Autowired
    @Qualifier("birinci")
    private IMyInterface myInterface;

    @Autowired
    @Qualifier("ikinci")
    private IMyInterface myInterface2;

    @Autowired
    private IMyInterface myObject3;

    @GetMapping("/hello")
    @PreAuthorize("hasRole('YONETICI')")
    public String hello() {
        return "Hello allianz";
    }

    @RequestMapping(path = "/hello2", method = RequestMethod.GET)
    public String hello2() {
        return "Hello 2 allianz";
    }

    @RequestMapping(path = "/hello3/{soyisim}/test/{yas}", method = RequestMethod.GET)
    public String hello3(@NotEmpty @Size(min = 5) @RequestParam("isim") final String name,
                         @PathVariable("soyisim") final String surname,
                         @PathVariable("yas") final int age) {
        return this.myInterface.execute(name,
                                        surname,
                                        age);
    }

    @RequestMapping(path = "/hello4/{soyisim}/test/{yas}", method = RequestMethod.GET)
    public String hello4(@NotEmpty @Size(min = 5) @RequestParam("isim") final String name,
                         @PathVariable("soyisim") final String surname,
                         @PathVariable("yas") final int age) {
        return this.myInterface2.execute(name,
                                         surname,
                                         age);
    }

    @RequestMapping(path = "/hello5/{soyisim}/test/{yas}", method = RequestMethod.GET)
    public String hello5(@NotEmpty @Size(min = 5) @RequestParam("isim") final String name,
                         @PathVariable("soyisim") final String surname,
                         @PathVariable("yas") final int age) {
        return this.myObject3.execute(name,
                                      surname,
                                      age);
    }

}
