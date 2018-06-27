package com.allianz.spring.boot.configs;


public class MyPropObj {

    private String appName;

    private String appVersion;

    private int    appPort;


    public String getAppName() {
        return this.appName;
    }


    public void setAppName(final String appNameParam) {
        this.appName = appNameParam;
    }


    public String getAppVersion() {
        return this.appVersion;
    }


    public void setAppVersion(final String appVersionParam) {
        this.appVersion = appVersionParam;
    }


    public int getAppPort() {
        return this.appPort;
    }


    public void setAppPort(final int appPortParam) {
        this.appPort = appPortParam;
    }


}
