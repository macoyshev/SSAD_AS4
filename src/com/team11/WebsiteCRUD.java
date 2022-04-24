package com.team11;

import java.util.List;

/** Class perform standards CRUD operations under website entity */
public class WebsiteCRUD implements CRUD<Website> {

  List<Website> webSites;

  /**
   * @param entry to delete from the database
   */
  @Override
  public void delete(Website entry) {
    webSites.remove(entry);
  }

  /**
   * @param entry to store in the database
   */
  @Override
  public void create(Website entry) {
    entry.id = webSites.size();
    webSites.add(entry);
  }

  /**
   * @param id of the entry to update
   * @param entry with updated fields
   */
  @Override
  public void update(int id, Website entry) {
    Website webSite = webSites.stream().filter(web -> web.id == id).findFirst().get();

    int index = webSites.indexOf(webSite);

    webSites.remove(index);
    webSites.set(index, entry);
  }

  /**
   * @param id of the entry to find in the database
   */
  @Override
  public Website findById(int id) {
    return webSites.stream().filter(webSite -> webSite.id == id).findFirst().get();
  }

  @Override
  public List<Website> findAll() {
    return webSites;
  }
}
