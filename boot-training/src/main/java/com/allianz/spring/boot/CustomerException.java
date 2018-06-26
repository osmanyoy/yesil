package com.allianz.spring.boot;


public class CustomerException extends Exception {

    private static final long serialVersionUID = -977160383154133460L;

    private String            desc;

    public String getDesc() {
        return this.desc;
    }


    public void setDesc(final String descParam) {
        this.desc = descParam;
    }


}
