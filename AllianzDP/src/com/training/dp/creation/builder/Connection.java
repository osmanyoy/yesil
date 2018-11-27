package com.training.dp.creation.builder;


public class Connection {

    private final String ip;
    private String       alernateIp;
    private final String name;
    private final int    port;


    public Connection(final String ipParam,
                      final String nameParam,
                      final int portParam) {
        super();
        this.ip = ipParam;
        this.name = nameParam;
        this.port = portParam;
    }


    public Connection(final String ipParam,
                      final String alernateIpParam,
                      final String nameParam,
                      final int portParam) {
        super();
        this.ip = ipParam;
        this.alernateIp = alernateIpParam;
        this.name = nameParam;
        this.port = portParam;
    }


    public String getAlernateIp() {
        return this.alernateIp;
    }


    public String getIp() {
        return this.ip;
    }


    public String getName() {
        return this.name;
    }


    public int getPort() {
        return this.port;
    }


}
