package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.MovieNTv;;

public class MovieHandler2 {

  static final int MOVIENTV_SIZE = 500;
  // MovieNTv 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 
  static MovieNTv[] arrMovies = new MovieNTv[MOVIENTV_SIZE]; // 레퍼런스 배열
  static int movieNTv_count = 0;

  // 다른 패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다. 
  public static Scanner keyboard;

  public static void addMovie() {


    System.out.println("=====나의 해외명작 컬렉션=====");
    System.out.println();
    for (int i = 0; i < MOVIENTV_SIZE; i++) {

      MovieNTv temp = new MovieNTv(); // 인스턴스 생성

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

      // 무비 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 레퍼런스 배열에 보관해 둔다. 
      arrMovies[movieNTv_count++] = temp;

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
  public static void listMovie() {
    for (int i = 0; i < movieNTv_count; i++) {
      MovieNTv temp = arrMovies[i];
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


  public static void detailMovie() {

    System.out.print("조회하실 번호를 고르세요. \n 1.제목  2.카테고리  3.장르  4.주연 ");
    String command = keyboard.nextLine();
    switch (command) {
      case "1" : do {
        System.out.printf("제목을 입력하세요.(종료를 원하시면 0을 눌러주세요.): ");
        command = keyboard.nextLine();
        for (int i = 0; i < movieNTv_count; i++) {
          if (command.equals(arrMovies[i].title)) {
            MovieNTv temp = arrMovies[i];
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
            System.out.println("================================= ");
          } else {
            System.out.println("정보를 찾을 수 없습니다.");
          }
        }
      } while (!command.equals("0"));
      break;
      case "2" : 
        myloop:
          for (int i = 0; i < movieNTv_count; i++) { 
            System.out.printf("카테고리를 입력하세요.: ");
            command = keyboard.nextLine();
            for (int j = 0; j < movieNTv_count; j++) {
              if (command.equals(arrMovies[j].category)) {
                MovieNTv temp = arrMovies[j];
                System.out.printf("\n%s\n",temp.title); 
              } else {
                System.out.println("정보를 찾을 수 없습니다.");
                continue myloop;
              }
            } 
            break myloop;
          }


      break;
      case "3" : System.out.printf("장르를 입력하세요.");
      break;
      case "4" : System.out.printf("주연을 입력하세요.");
      break;     
    }






    int no = keyboard.nextInt();
    for (int i = 0; i < movieNTv_count; i++) {
      MovieNTv temp = arrMovies[i];
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




    String no = keyboard.nextLine();
  }

  public static void detailMovie2() {
    System.out.println("별점: ");



  }


}
