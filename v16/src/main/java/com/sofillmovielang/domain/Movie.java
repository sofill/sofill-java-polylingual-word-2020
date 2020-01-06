package com.sofillmovielang.domain;

public class Movie {
  
    private String title;
    private String releaseDay;
    private float myRating;
    private String category; // (1.movie 2.tv-show;
    private String genre; // (1.mystery 2.thriller 3.romance 4.drama 5.crime 6.fanatasy 7.animation)
    private String director;
    private String writer;
    private String stars; 
    private String review;
    
    
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getCategory() {
      return category;
    }
    public void setCategory(String category) {
      this.category = category;
    }
    public String getGenre() {
      return genre;
    }
    public void setGenre(String genre) {
      this.genre = genre;
    }
    public String getDirector() {
      return director;
    }
    public void setDirector(String director) {
      this.director = director;
    }
    public String getStars() {
      return stars;
    }
    public void setStars(String stars) {
      this.stars = stars;
    }
    public String getWriter() {
      return writer;
    }
    public void setWriter(String writer) {
      this.writer = writer;
    }
    public String getReleaseDay() {
      return releaseDay;
    }
    public void setReleaseDay(String releaseDay) {
      this.releaseDay = releaseDay;
    }
    public float getMyRating() {
      return myRating;
    }
    public void setMyRating(float myRating) {
      this.myRating = myRating;
    }
    public String getReview() {
      return review;
    }
    public void setReview(String review) {
      this.review = review;
    }
    
  }
