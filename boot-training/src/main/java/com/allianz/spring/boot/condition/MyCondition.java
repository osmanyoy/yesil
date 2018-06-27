package com.allianz.spring.boot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class MyCondition implements Condition {

    @Override
    public boolean matches(final ConditionContext contextParam,
                           final AnnotatedTypeMetadata metadataParam) {
        MultiValueMap<String, Object> allAnnotationAttributesLoc = metadataParam.getAllAnnotationAttributes(TestCondition.class.getName());
        String abs = (String) allAnnotationAttributesLoc.getFirst("abs");
        String propertyLoc = contextParam.getEnvironment()
                                         .getProperty("my.run.con");
        return propertyLoc.equals(abs);
    }

}
