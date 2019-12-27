package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.MovieNTv;;

public class MovieHandler {

  static final int MOVIENTV_SIZE = 500;
  // MovieNTv 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 
  MovieNTv[] arrMovies = new MovieNTv[MOVIENTV_SIZE]; // 레퍼런스 배열
  int movieNTv_count = 0;

  // 다른 패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다. 
  public static Scanner keyboard;

  public void addMovie() {

    System.out.println("=====나의 해외명작 컬렉션=====");
    System.out.println();
    for (int i = 0; i < MOVIENTV_SIZE; i++) {

      MovieNTv temp = new MovieNTv(); // 인스턴스 생성
      System.out.print("1.제목: ");
      temp.title = keyboard.nextLine();
      System.out.print("2.개봉일: ");
      temp.releaseDay = keyboard.nextLine();
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

      // 무비 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 레퍼런스 배열에 보관해 둔다. 
      this.arrMovies[this.movieNTv_count++] = temp;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }


    System.out.println("저장하였습니다.");
  }
  public void listMovie() {
    for (int i = 0; i < this.movieNTv_count; i++) {
      MovieNTv temp = this.arrMovies[i];
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.제목 - %s\n", temp.title);
      System.out.printf("2.개봉일 - %s\n", temp.releaseDay);
      System.out.printf("3.나의 별점 - %.1f\n", temp.myRating);
      System.out.printf("4.카테고리 - %s\n", temp.category);
      System.out.printf("5.장르 - %s\n", temp.genre);
      System.out.printf("6.감독 - %s\n", temp.director);
      System.out.printf("7.작가 - %s\n", temp.writer);
      System.out.printf("8.주연 - %s\n", temp.stars);
      System.out.printf("9.한줄 평가 - %s\n", temp.review); 
      System.out.println();
    }
    System.out.println("================================= ");
    Date today1 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today1);
    System.out.println();
  }

  public void detailMovie() {
    System.out.println("조회하실 번호를 고르세요. \n 1.제목 2.카테고리 3.장르 4.주연");
    String command = keyboard.nextLine(); //
    switch (command)  {
      case "1" :  
        System.out.println("제목을 입력하세요.");
        String title = keyboard.nextLine();
        MovieNTv m = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].title.equals(title)) {
            m = this.arrMovies[i];
            break;
          }
        }
        if (m == null) {
          System.out.println("제목이 유효하지 않습니다.");
          return;  
        }
        System.out.println();
        System.out.println("================================= ");
        System.out.println();
        System.out.printf("1.제목 - %s\n", m.title);
        System.out.printf("2.개봉일 - %s\n", m.releaseDay);
        System.out.printf("3.나의 별점 - %.1f\n", m.myRating);
        System.out.printf("4.카테고리 - %s\n", m.category);
        System.out.printf("5.장르 - %s\n", m.genre);
        System.out.printf("6.감독 - %s\n", m.director);
        System.out.printf("7.작가 - %s\n", m.writer);
        System.out.printf("8.주연 - %s\n", m.stars);
        System.out.printf("9.한줄 평가 - %s\n", m.review); 
        System.out.println();
        System.out.println("================================= ");
        Date today1 = new Date(System.currentTimeMillis());
        System.out.println("                출력일 : " + today1);
        System.out.println();
        break;

      case "2": 
        System.out.println("카테고리를 입력하세요.");
        String category = keyboard.nextLine();
        MovieNTv m2 = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].category.equals(category)) {
            m2 = this.arrMovies[i];
            System.out.println();
            System.out.printf("제목 - %s\n", m2.title);
          }
        }
        if (m2 == null) {
          System.out.println("카테고리가 유효하지 않습니다.");
          return;  
        }
        Date today2 = new Date(System.currentTimeMillis());
        System.out.println("                출력일 : " + today2);
        System.out.println();
        break;
      case "3": 
        System.out.println("장르를 입력하세요.");
        String genre = keyboard.nextLine();
        MovieNTv m3 = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].genre.equals(genre)) {
            m3 = this.arrMovies[i];
            System.out.println();
            System.out.printf("제목 - %s\n", m3.title);
          }
        }
        if (m3 == null) {
          System.out.println("장르가 유효하지 않습니다.");
          return;  
        }
        Date today3 = new Date(System.currentTimeMillis());
        System.out.println("                출력일 : " + today3);
        System.out.println();
        break;
      case "4": 
        System.out.println("배우 이름을 입력하세요.");
        String stars = keyboard.nextLine();
        MovieNTv m4 = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].stars.equals(stars)) {
            m4 = this.arrMovies[i];
            System.out.println();
            System.out.printf("제목 - %s\n", m4.title);
          }
        }
        if (m4 == null) {
          System.out.println("배우 이름이 유효하지 않습니다.");
          return;  
        }
        Date today4 = new Date(System.currentTimeMillis());
        System.out.println("                출력일 : " + today4);
        System.out.println();
        break;
    }

  }

}
