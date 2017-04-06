package com.teamtreehouse.review;


import com.sun.org.apache.regexp.internal.RE;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final Long id;
  private int rating;
  private String description;

  // TODO: max - We are duplicating code here for every single entity. Share it?
  protected Review(){
    id = null;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
