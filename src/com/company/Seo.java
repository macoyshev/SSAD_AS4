package com.company;
import java.util.*;

public class Seo {
    private final Map<WebSite, Integer> errorCounter = new HashMap<>();
    private final Map<WebSite, Integer> visitorCounter = new HashMap<>();
    private Server server;

    private double calculatePoints(WebSite webSite){
        int keywordsNumber = webSite.getKeywordsSize();
        double points = (visitorCounter.get(webSite) + 1.0) * (keywordsNumber * keywordsNumber + 1);
        return points / errorCounter.get(webSite);
    }



    public String consoleInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    private List<WebSite> suggester() {
        String substring = consoleInput();
        List<WebSite> webSites = server.filter(substring);

        // TODO: logic here
        return null;
    }

    public int compareTo()

}

