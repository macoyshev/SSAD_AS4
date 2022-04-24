package com.team11;

import java.util.ArrayList;
import java.util.List;

class Website {
  public int id;
  private final String url;
  private final String title;
  private final List<String> keywords;

  public Website(String title, String url, ArrayList<String> keywords) {
    this.title = title;
    this.url = url;
    this.keywords = keywords;
  }

  public void addKeyword(String keyword) {
    keywords.add(keyword);
  }

  public String getUrl() {
    return url;
  }

  public List<String> getKeywords() {
    return keywords;
  }

  public int getKeywordsSize() {
    return keywords.size();
  }

  public String getTitle() {
    return title;
  }

}
