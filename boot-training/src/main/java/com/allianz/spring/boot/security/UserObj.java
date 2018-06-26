package com.allianz.spring.boot.security;


public class UserObj {

    private String username;
    private String password;
    private String role;


    public UserObj(final String usernameParam,
                final String passwordParam,
                final String roleParam) {
        super();
        this.username = usernameParam;
        this.password = passwordParam;
        this.role = roleParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(final String roleParam) {
        this.role = roleParam;
    }


}
