package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class MovieHandler {

  static class MovieInfo {
    int no;
    String title;
    String genre;
    String stars;
    Date releaseDay;
    float myRating;
  }

  static final int MOVIEINFO_SIZE = 500;
  static MovieInfo[] arrMovies = new MovieInfo[MOVIEINFO_SIZE]; // 레퍼런스 배열
  static int movie_Count = 0;
  static Scanner keyboard;


  static void addMovie() {

    MovieInfo movies = new MovieInfo(); // 인스턴스 생성

    for (int i = 0; i < MOVIEINFO_SIZE; i++) {
      movie_Count++;

      System.out.print("번호: ");
      movies.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("제목: ");
      movies.title = keyboard.nextLine();

      System.out.print("개봉일: ");
      movies.releaseDay = Date.valueOf(keyboard.next());
      keyboard.nextLine();

      System.out.print("장르: ");
      movies.genre = keyboard.nextLine();

      System.out.print("주연: ");
      movies.stars = keyboard.nextLine();

      System.out.print("나의 평점: ");
      movies.myRating = keyboard.nextFloat();
      keyboard.nextLine();
      System.out.println();

      arrMovies[i] = movies;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  }

  static void listMovie() {

    System.out.println("=====나의 해외명작 컬렉션=====");
    System.out.println();
    for (int i = 0; i < movie_Count; i++) {
      MovieInfo m = arrMovies[i];
      System.out.printf("%d. %s, %s, %s, %s, %s\n", m.no, m.title, m.releaseDay, m.myRating, m.genre, m.stars);
    }
    System.out.println();
    Date today1 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today1);
  }
}
