package com.yapikredi.java.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RoleManager {

    private final Map<String, Role> roles = new HashMap<>();

    public Role getRole(final String name) {
        Role role = this.roles.get(name);
        if (role == null) {
            // Fetch from WS or DB
            role = new Role();
        }
        return role.clone();
    }
}
