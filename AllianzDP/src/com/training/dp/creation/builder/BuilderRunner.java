package com.training.dp.creation.builder;


public class BuilderRunner {

    public static void main(final String[] args) {
        Connection connectionLoc = new Connection("127.0.0.1",
                                                  "localhost",
                                                  "test",
                                                  1990);

        ConnectionWithBuilder buildLoc = ConnectionWithBuilder.getBuilder()
                                                              .withIp("127.0.0.1")
                                                              .withAlternateIp("localhost")
                                                              .withName("test")
                                                              .withPort(1990)
                                                              .build();
    }
}
