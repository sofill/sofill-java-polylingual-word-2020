package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.MovieNTv;;

public class MovieHandler {

  static final int MOVIENTV_SIZE = 500;

  MovieNTv[] arrMovies; // 생성자로 뒷부분 이동
  int movieNTv_count = 0;

  Scanner input; // 이제는 public일 필요가 없다. 생성자에서만 사용.

  //생성자
  public MovieHandler(Scanner input) {
    this.input = input; //초기화
    this.arrMovies = new MovieNTv[MOVIENTV_SIZE];
  } //생성자 : 생성자를 넣음으로써 꼭 필요한 기능을 강제로 수행하도록 한다.
    //예를 들어 키보드 사용 같은 것.

  public void addMovie() {

    System.out.println("=====나의 해외명작 컬렉션=====");
    System.out.println();
    for (int i = 0; i < MOVIENTV_SIZE; i++) {

      MovieNTv temp = new MovieNTv(); // 인스턴스 생성
      System.out.print("1.제목: ");
      temp.setTitle(input.nextLine());
      System.out.print("2.개봉일: ");
      temp.setReleaseDay(input.nextLine());
      System.out.print("3.나의 평점(5점만점): ");
      temp.setMyRating(input.nextFloat());
      input.nextLine();
      System.out.print("4.카테고리(영화/TV드라마/애니/도서 등): ");
      temp.setCategory(input.nextLine());
      System.out.print("5.장르(드라마/스릴러/액션/코미디 등): ");
      temp.setGenre(input.nextLine());
      System.out.print("6.감독: ");
      temp.setDirector(input.nextLine());
      System.out.print("7.작가: ");
      temp.setWriter(input.nextLine());
      System.out.print("8.주연: ");
      temp.setStars(input.nextLine());
      System.out.print("9.한줄 평가: ");
      temp.setReview(input.nextLine());
      System.out.println();

      // 무비 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 레퍼런스 배열에 보관해 둔다. 
      this.arrMovies[this.movieNTv_count++] = temp;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = input.nextLine();
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
      System.out.printf("1.제목 - %s\n", temp.getTitle());
      System.out.printf("2.개봉일 - %s\n", temp.getReleaseDay());
      System.out.printf("3.나의 별점 - %.1f\n", temp.getMyRating());
      System.out.printf("4.카테고리 - %s\n", temp.getCategory());
      System.out.printf("5.장르 - %s\n", temp.getGenre());
      System.out.printf("6.감독 - %s\n", temp.getDirector());
      System.out.printf("7.작가 - %s\n", temp.getWriter());
      System.out.printf("8.주연 - %s\n", temp.getStars());
      System.out.printf("9.한줄 평가 - %s\n", temp.getReview()); 
      System.out.println();
    }
    System.out.println("================================= ");
    Date today1 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today1);
    System.out.println();
  }

  public void detailMovie() {
    System.out.println("조회하실 번호를 고르세요. \n 1.제목 2.카테고리 3.장르 4.주연");
    String command = input.nextLine(); //
    switch (command)  {
      case "1" :  
        System.out.println("제목을 입력하세요.");
        String title = input.nextLine();
        MovieNTv m = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].getTitle().equals(title)) {
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
        System.out.printf("1.제목 - %s\n", m.getTitle());
        System.out.printf("2.개봉일 - %s\n", m.getReleaseDay());
        System.out.printf("3.나의 별점 - %.1f\n", m.getMyRating());
        System.out.printf("4.카테고리 - %s\n", m.getCategory());
        System.out.printf("5.장르 - %s\n", m.getGenre());
        System.out.printf("6.감독 - %s\n", m.getDirector());
        System.out.printf("7.작가 - %s\n", m.getWriter());
        System.out.printf("8.주연 - %s\n", m.getStars());
        System.out.printf("9.한줄 평가 - %s\n", m.getReview()); 
        System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        System.out.println("================================= ");
        Date today1 = new Date(System.currentTimeMillis());
        System.out.println("                출력일 : " + today1);
        System.out.println();
        break;

      case "2": 
        System.out.println("카테고리를 입력하세요.");
        String category = input.nextLine();
        MovieNTv m2 = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].getCategory().equals(category)) {
            m2 = this.arrMovies[i];
            System.out.println();
            System.out.printf("제목 - %s\n", m2.getTitle());
          }
        }
        if (m2 == null) {
          System.out.println("카테고리가 유효하지 않습니다.");
          return;  
        }
        Date today2 = new Date(System.currentTimeMillis());
        System.out.println("               \n출력일 : " + today2);
        System.out.println();
        break;
      case "3": 
        System.out.println("장르를 입력하세요.");
        String genre = input.nextLine();
        MovieNTv m3 = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].getGenre().equals(genre)) {
            m3 = this.arrMovies[i];
            System.out.println();
            System.out.printf("제목 - %s\n", m3.getTitle());
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
        String stars = input.nextLine();
        MovieNTv m4 = null;    
        for (int i = 0; i < this.movieNTv_count; i++) {
          if (this.arrMovies[i].getStars().equals(stars)) {
            m4 = this.arrMovies[i];
            System.out.println();
            System.out.printf("제목 - %s\n", m4.getTitle());
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
