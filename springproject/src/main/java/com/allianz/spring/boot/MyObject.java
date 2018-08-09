package com.allianz.spring.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyObject {

    @Id
    @GeneratedValue
    private long   myObjId;
    private String userName;
    private int    testVal;

    public long getMyObjId() {
        return this.myObjId;
    }

    public void setMyObjId(final long myObjIdParam) {
        this.myObjId = myObjIdParam;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userNameParam) {
        this.userName = userNameParam;
    }

    public int getTestVal() {
        return this.testVal;
    }

    public void setTestVal(final int testValParam) {
        this.testVal = testValParam;
    }


}
