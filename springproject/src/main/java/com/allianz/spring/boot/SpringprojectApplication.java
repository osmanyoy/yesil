package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringprojectApplication {

    @Autowired
    private MyNewClass      myNewClass1;

    @Autowired
    private MyNewClass      myNewClass2;

    @Autowired
    @Qualifier("cm1")
    private CustomerManager xyzManager;


    public SpringprojectApplication() {
        System.out.println("SpringprojectApplication cosntructor");
    }


    public static void main(final String[] args) {

        ConfigurableApplicationContext runLoc = SpringApplication.run(SpringprojectApplication.class,
                                                                      args);

        SpringprojectApplication beanLoc = runLoc.getBean(SpringprojectApplication.class);

        beanLoc.getMyNewClass1()
               .setMyName("osman");
        beanLoc.getMyNewClass1()
               .setMySurname("yaycioglu");

        System.out.println("name : "
                           + beanLoc.getMyNewClass2()
                                    .getMyName()
                           + " surname : "
                           + beanLoc.getMyNewClass2()
                                    .getMySurname());


        //        String cmnLoc = runLoc.getEnvironment()
        //                              .getProperty("customer.manager.name");
        //        beanLoc.getCustomerManager()
        //               .setName(cmnLoc);

        System.out.println(beanLoc.getCustomerManager()
                                  .getName());


    }


    public MyNewClass getMyNewClass1() {
        return this.myNewClass1;
    }


    public void setMyNewClass1(final MyNewClass myNewClass1Param) {
        this.myNewClass1 = myNewClass1Param;
    }


    public MyNewClass getMyNewClass2() {
        return this.myNewClass2;
    }


    public void setMyNewClass2(final MyNewClass myNewClass2Param) {
        this.myNewClass2 = myNewClass2Param;
    }


    public CustomerManager getCustomerManager() {
        return this.xyzManager;
    }


    public void setCustomerManager(final CustomerManager customerManagerParam) {
        this.xyzManager = customerManagerParam;
    }


}
