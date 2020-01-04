package com.sofillmovielang.handler;

import java.util.Arrays;
import com.sofillmovielang.domain.Movie;

public class MovieList { //배열만 따로 다루려고 만드는 클래스

  ///필드///
  static final int MOVIE_SIZE = 100;
  Movie[] list; 
  int size = 0;

  ///생성자///
  public MovieList() {
    this.list = new Movie[MOVIE_SIZE];
  }

  public MovieList(int capacity) {
    if (capacity > MOVIE_SIZE && capacity <= 10000) {
      this.list = new Movie[capacity];
    } else {
      this.list = new Movie[MOVIE_SIZE];
    }
  }

  ///메서드///
  public Movie[] toArray() {
    /*
    Movie[] arr = new Movie[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
    }
     */
    return Arrays.copyOf(this.list, this.size);

  }
  
  // 영화 데이터를 저장
  public void add(Movie temp) {
    if (this.size == this.list.length) {
      // 현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려 준다.
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    
    this.list[this.size++] = temp;
    
  }
}
