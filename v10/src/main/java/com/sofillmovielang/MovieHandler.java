package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class MovieHandler {

  static class Movie {
    String title;
    String category; // (1.movie 2.tv-show;
    String genre; // (1.mystery 2.thriller 3.romance 4.drama 5.crime 6.fanatasy 7.animation)
    String director;
    String stars; 
    String writer;
    Date releaseDay;
    float myRating;
    String review;
  }
  static final int MOVIE_SIZE = 500;
  static Movie[] arrMovies = new Movie[MOVIE_SIZE]; // 레퍼런스 배열
  static int movie_count = 0;
  static Scanner keyboard;
  
  static void addMovie() {
    System.out.println("=====나의 해외명작 컬렉션=====");
    System.out.println();
    for (int i = 0; i < MOVIE_SIZE; i++) {
      movie_count++;
      Movie temp = new Movie(); // 인스턴스 생성

      System.out.print("1.제목: ");
      temp.title = keyboard.nextLine();

      System.out.print("2.개봉일: ");
      temp.releaseDay = Date.valueOf(keyboard.next());

      System.out.print("3.나의 평점: ");
      temp.myRating = keyboard.nextFloat();
      keyboard.nextLine();

      System.out.print("4.카테고리: ");
      temp.category = keyboard.nextLine();

      System.out.print("5.장르: ");
      temp.genre = keyboard.nextLine();

      System.out.print("6.감독: ");
      temp.director = keyboard.nextLine();

      System.out.print("7.작가: ");
      temp.writer = keyboard.nextLine();

      System.out.print("8.주연: ");
      temp.stars = keyboard.nextLine();

      System.out.print("9.한줄 평가: ");
      temp.review = keyboard.nextLine();

      System.out.println();
      arrMovies[i] = temp;

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
    for (int i = 0; i < movie_count; i++) {
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.제목 - %s\n", arrMovies[i].title);
      System.out.printf("2.개봉일 - %s\n", arrMovies[i].releaseDay);
      System.out.printf("3.나의 별점 - %.1f\n", arrMovies[i].myRating);
      System.out.printf("4.카테고리 - %s\n", arrMovies[i].category);
      System.out.printf("5.장르 - %s\n", arrMovies[i].genre);
      System.out.printf("6.감독 - %s\n", arrMovies[i].director);
      System.out.printf("7.작가 - %s\n", arrMovies[i].writer);
      System.out.printf("8.주연 - %s\n", arrMovies[i].stars);
      System.out.printf("9.한줄 평가 - %s\n", arrMovies[i].review); 
      System.out.println();
    }
    System.out.println("================================= ");
    Date today1 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today1);
    System.out.println();
  }
  
}
