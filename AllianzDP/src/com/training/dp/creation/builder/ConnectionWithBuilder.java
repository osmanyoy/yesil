package com.training.dp.creation.builder;


public class ConnectionWithBuilder {

    private String ip;
    private String alernateIp;
    private String name;
    private int    port;

    private ConnectionWithBuilder() {
    }

    public String getIp() {
        return this.ip;
    }


    public String getAlernateIp() {
        return this.alernateIp;
    }


    public String getName() {
        return this.name;
    }


    public int getPort() {
        return this.port;
    }

    public static ConnectionWithBuilderBuilder getBuilder() {
        return new ConnectionWithBuilderBuilder();
    }

    public static class ConnectionWithBuilderBuilder {

        private final ConnectionWithBuilder connectionWithBuilder = new ConnectionWithBuilder();

        private ConnectionWithBuilderBuilder() {

        }

        public ConnectionWithBuilderBuilder withIp(final String ip) {
            this.connectionWithBuilder.ip = ip;
            return this;
        }

        public ConnectionWithBuilderBuilder withAlternateIp(final String altIp) {
            this.connectionWithBuilder.alernateIp = altIp;
            return this;
        }

        public ConnectionWithBuilderBuilder withName(final String name) {
            this.connectionWithBuilder.name = name;
            return this;
        }

        public ConnectionWithBuilderBuilder withPort(final int port) {
            this.connectionWithBuilder.port = port;
            return this;
        }

        public ConnectionWithBuilder build() {
            return this.connectionWithBuilder;
        }
    }

}
