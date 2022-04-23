package com.company;

public class User {
    private String name;
    private String password;
    private Role role;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean hasAuthorities(Role role) {
        return this.role.equals(role);
    }
}
