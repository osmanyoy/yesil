package com.allianz.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.test.TestConfig;

@Configuration
@PropertySources({
                   @PropertySource("classpath:my.properties"),
                   @PropertySource("classpath:my2.properties")
})
@Import(TestConfig.class)
public class MyConfig {

    @Bean
    @Qualifier("onemli")
    public IMyInterface createMyInterface(@Value("${my.object.index}") final int index) {
        switch (index) {
            case 1:
                return new MyObject();
            case 2:
                return new MyObject2();
            case 3:
                return new MyObject3();

            default:
                return new MyObject();
        }
    }

    @Bean
    @Qualifier("onemli2")
    public IMyInterface createMyInterface2(@Value("#{myTestBean.getIndex()}") final int index) {
        switch (index) {
            case 1:
                return new MyObject();
            case 2:
                return new MyObject2();
            case 3:
                return new MyObject3();

            default:
                return new MyObject();
        }
    }

    @Bean
    @Qualifier("onemli3")
    public IMyInterface createMyInterface3() {
        int index = 1; // DB Access
        switch (index) {
            case 1:
                return new MyObject();
            case 2:
                return new MyObject2();
            case 3:
                return new MyObject3();

            default:
                return new MyObject();
        }
    }

    @Autowired
    public void init(@Qualifier("onemli2") final IMyInterface interfaceParam,
                     @Value("${customer.name}") final String name,
                     @Value("${customer.surname}") final String surname,
                     @Value("${customer.age}") final int age) {
        System.out.println("Burası bir kez kullanılacak");
        interfaceParam.execute(name,
                               surname,
                               age);
    }

}
