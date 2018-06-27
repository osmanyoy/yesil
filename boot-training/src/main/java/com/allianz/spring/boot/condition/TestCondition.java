package com.allianz.spring.boot.condition;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Conditional;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD
})
@Conditional(MyCondition.class)
public @interface TestCondition {

    String abs();
}
