package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Movie;

public class MovieHandler {

  // 인스턴스 필드 = 논스태틱 필드
  Movie[] movies = new Movie[MOVIE_SIZE];
  int movieCount = 0;

  // 클래스 필드 = 스태틱 필드
  // 공유할 변수
  static final int MOVIE_SIZE = 1000;
  public static Scanner keyboard;

  // 인스턴스 메서드
  // => 인스턴스가 있어야만 호출할 수 있는 메서드이다.
  // => 인스턴스를 사용하는 메서드인 경우 인스턴스 메서드로 선언하라.
  // => 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  //        인스턴스주소.메서드명();

  public void addMovie() {
    //  (레퍼런스)
    Movie movie = new Movie();

    System.out.print("번호? ");
    movie.no = keyboard.nextInt();
    keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("제목? ");
    movie.title = keyboard.nextLine();

    System.out.print("장르? ");
    movie.genre = keyboard.nextLine();

    System.out.print("주연? ");
    movie.star = keyboard.nextLine();

    System.out.println("평점? ");
    movie.myRating = keyboard.nextFloat();

    keyboard.nextLine(); // nextFloat() 후에 남아 있는 줄바꿈 값 제거

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
    // 레퍼런스 배열에 보관해 둔다.
    this.movies[movieCount++] = movie;
    System.out.println("저장하였습니다.");
  }


  public void listMovie() {
    for (int i = 0; i < this.movieCount; i++) {
      Movie m = this.movies[i];
      System.out.printf("%d. %s, %s, %s, %s\n", m.no, m.title, m.genre, m.star, m.myRating);
    }
  }


  public void detailMovie() {
    System.out.print("영화 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 숫자 뒤에 남은 공백 제거

    Movie movie = null; // 게시물 인덱스번호 말고 게시물 번호로 출력할 수 있도록 바꾸는 것
    for (int i = 0; i < this.movieCount; i++) {
      if (this.movies[i].no == no) {
        movie = this.movies[i];
        break;
      }
    }

    if (movie == null) {
      System.out.println("영화 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("제목: %s\n", movie.title);
    System.out.printf("장르: %s\n", movie.genre);
    System.out.printf("주연: %s\n", movie.star);
    System.out.printf("평점: %s\n", movie.myRating);

  }
}