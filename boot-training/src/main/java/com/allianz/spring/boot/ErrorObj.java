package com.allianz.spring.boot;


public class ErrorObj {

    private Integer cause;
    private String  desc;


    public ErrorObj(final Integer causeParam,
                    final String descParam) {
        this.cause = causeParam;
        this.desc = descParam;
    }

    public Integer getCause() {
        return this.cause;
    }

    public void setCause(final Integer causeParam) {
        this.cause = causeParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }


}
