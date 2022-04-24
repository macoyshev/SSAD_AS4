package com.team11;
import java.util.*;

public class Seo {
    private final Map<Website, Integer> errorCounter = new HashMap<>();
    private final Map<Website, Integer> visitorCounter = new HashMap<>();
    private Server server;

    public Seo(Server server) {
        this.server = server;
    }

    private double calculatePoints(Website webSite){
        int keywordsNumber = webSite.getKeywordsSize();
        double points = (visitorCounter.get(webSite) + 1.0) * (keywordsNumber * keywordsNumber + 1);
        return points / errorCounter.get(webSite);
    }

    public String consoleInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public List<Website> suggester() {
        String substring = consoleInput();
        List<Website> webSites = server.filter(substring);

        webSites.sort(Comparator.comparing(this::calculatePoints));

        return webSites;
    }
}

