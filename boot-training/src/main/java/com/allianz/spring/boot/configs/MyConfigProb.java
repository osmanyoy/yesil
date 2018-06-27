package com.allianz.spring.boot.configs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.test")
public class MyConfigProb {

    private String               strVal1;
    private int                  port;
    private String[]             strArrays;

    private List<String>         listStrings;

    private MyPropObj            myPropObj;

    private Map<String, Integer> mapTest;


    public String getStrVal1() {
        return this.strVal1;
    }


    public void setStrVal1(final String strVal1Param) {
        this.strVal1 = strVal1Param;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(final int portParam) {
        this.port = portParam;
    }


    public String[] getStrArrays() {
        return this.strArrays;
    }


    public void setStrArrays(final String[] strArraysParam) {
        this.strArrays = strArraysParam;
    }


    public List<String> getListStrings() {
        return this.listStrings;
    }


    public void setListStrings(final List<String> listStringsParam) {
        this.listStrings = listStringsParam;
    }


    public MyPropObj getMyPropObj() {
        return this.myPropObj;
    }


    public void setMyPropObj(final MyPropObj myPropObjParam) {
        this.myPropObj = myPropObjParam;
    }


    public Map<String, Integer> getMapTest() {
        return this.mapTest;
    }


    public void setMapTest(final Map<String, Integer> mapTestParam) {
        this.mapTest = mapTestParam;
    }


    @Override
    public String toString() {
        return "MyConfigProb [strVal1="
               + this.strVal1
               + ", port="
               + this.port
               + ", strArrays="
               + Arrays.toString(this.strArrays)
               + ", listStrings="
               + this.listStrings
               + ", myPropObj="
               + this.myPropObj
               + ", mapTest="
               + this.mapTest
               + "]";
    }


}
