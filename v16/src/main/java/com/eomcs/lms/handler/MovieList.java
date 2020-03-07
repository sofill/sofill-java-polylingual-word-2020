package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Movie;

public class MovieList {

  private static final int MOVIE_SIZE = 1000;

  private Movie[] list;
  private int size;

  public MovieList() {
    this.list = new Movie[MOVIE_SIZE];
  }

  public MovieList(int capacity) {
    if (capacity < MOVIE_SIZE || capacity > 10000) {
      this.list = new Movie[capacity];
    } else {
      this.list = new Movie[MOVIE_SIZE];
    }
  }

  public Movie[] toArray() {
    /*
    Movie[] movies = new Movie[this.size];
    for (int i = 0; i < this.size; i++) {
      movies[i] = this.list[i];
    }
    return movies;
     */
    return Arrays.copyOf(this.list,  this.size);
  }

  public void add(Movie movie) {
    if (this.size == this.list.length) {  //현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려준다.
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = movie;
  }

  public Movie get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}
