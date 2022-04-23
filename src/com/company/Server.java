package com.company;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private final List<WebSite> websites = new ArrayList<>();
    private State state;

    public Server() {
        this.state = new Active();
    }

    public void storeWebsite(WebSite webSite) {
        websites.add(webSite);
    }

    public List<WebSite> filter(String substring) {
        List<WebSite> response = new ArrayList<>();

        for(WebSite webSite: websites) {
            for(String s: substring.split(" ")) {
                if (webSite.getKeywords().contains(s))
                    response.add(webSite);
            }
        }

        return response;
    }

    public void turnDown(User user) {
        if (user.hasAuthorities(Role.ADMIN))
            this.state = new NotActive();
    }

    abstract static class State {
        abstract boolean status();
    }

    static class Active extends State{
        @Override
        boolean status() {
            return true;
        }
    }

    static class NotActive extends State {
        @Override
        boolean status() {
            return false;
        }
    }
}

