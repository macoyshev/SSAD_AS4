package com.team11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Website website1 = new Website("vk", "vk.com", new ArrayList<>(List.of("social", "entertainment", "friends")));
        Website website2 = new Website("classmates", "ok.ru", new ArrayList<>(List.of("social", "entertainment", "grandmas", "grandpas")));
        Website website3 = new Website("wikipedia", "wiki.org", new ArrayList<>(List.of("education", "school", "science", "academic")));
        Website website4 = new Website("english learn", "EngLer.com", new ArrayList<>(List.of("education", "school", "science", "academic", "english", "learning")));
        Website website5 = new Website("game world", "gameChange.com", new ArrayList<>(List.of("entertainment", "games", "arcades", "shooter")));
        Website website6 = new Website("painting", "paint.com", new ArrayList<>(List.of("entertainment", "drawing", "pictures", "paints")));

        CRUD<Website> crud = new WebsiteCRUD();
        Server server = new Server(crud);

        server.createWebsite(website1);
        server.createWebsite(website2);
        server.createWebsite(website3);
        server.createWebsite(website4);
        server.createWebsite(website5);
        server.createWebsite(website6);

        Seo seo = new Seo(server);

        List<Website> websites = seo.suggester();
        System.out.println(websites);
    }
}