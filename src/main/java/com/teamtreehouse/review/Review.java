package com.teamtreehouse.review;


import com.teamtreehouse.core.BaseEntity;
import com.teamtreehouse.course.Course;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Review extends BaseEntity{

  private int rating;
  private String description;
  @ManyToOne
  private Course course;

  // TODO: max - We are duplicating code here for every single entity. Share it?
  protected Review(){
    super();
  }

  public Course getCourse() {
    return course;
  }

  public Review(int rating, String description) {
    this.rating = rating;
    this.description = description;
  }

  public void setCourse(Course course) {
    this.course = course;
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
