package com.eomcs.lms;

import java.util.Scanner;

public class MovieHandler {
  int no;
  String title;
  String genre;
  String star;
  int myRating;


  static final int MOVIE_SIZE = 1000;
  static MovieHandler[] movies = new MovieHandler[MOVIE_SIZE];
  static int movieCount = 0;
  static Scanner keyboard; // 객체 지향에서는 크로스 참조는 절대 하면 안된다. 서로 참조하는 것 x


  static void addMovie() {

    MovieHandler movie = new MovieHandler();
    //  (레퍼런스)
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
    movie.myRating = keyboard.nextInt();
    keyboard.nextLine();

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
    // 레퍼런스 배열에 보관해 둔다.
    movies[movieCount++] = movie;
    System.out.println("저장하였습니다.");
  }


  static void listMovie() {

    for (int i = 0; i < movieCount; i++) {
      MovieHandler m = movies[i];
      System.out.printf("%d. %s, %s, %s, %s\n",
          m.no, m.title,
          m.genre, m.star, m.myRating);
    }
  }
}