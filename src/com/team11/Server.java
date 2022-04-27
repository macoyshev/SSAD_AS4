package com.team11;

import java.util.ArrayList;
import java.util.List;

public class Server {
  CRUD<Website> websiteRepository;

  public Server(CRUD<Website> crud) {
    this.websiteRepository = crud;
  }

  public void createWebsite(Website webSite) {
    websiteRepository.create(webSite);
  }

  /**
   * The function returns list of websites that contains at least one word from substring in the
   * keywords or title
   *
   * @param substring string to search for
   */
  public List<Website> filter(String substring) {
    List<Website> response = new ArrayList<>();
    for (Website webSite : websiteRepository.findAll()) {
      for(String s: substring.split(" ")) {
        if (webSite.getKeywords().contains(s))
          response.add(webSite);
      }
    }

    return response;
  }

  public void setWebsiteRepository(CRUD<Website> websiteRepository) {
    this.websiteRepository = websiteRepository;
  }
}

