package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Movie;

public class MovieHandler {

  ArrayList movieList;

  Scanner input;


  public MovieHandler(Scanner input) {
    this.input = input;
    movieList = new ArrayList();
  }

  public MovieHandler(Scanner input, int capacity) {
    this.input = input;
    movieList = new ArrayList(capacity);
  }

  public void addMovie() {
    //  (레퍼런스)
    Movie movie = new Movie();

    System.out.print("번호? ");
    movie.setNo(input.nextInt());
    input.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("제목? ");
    movie.setTitle(input.nextLine());

    System.out.print("장르? ");
    movie.setGenre(input.nextLine());

    System.out.print("주연? ");
    movie.setStar(input.nextLine());

    System.out.println("평점? ");
    movie.setMyRating(input.nextFloat());

    input.nextLine(); // nextFloat() 후에 남아 있는 줄바꿈 값 제거

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
    // 레퍼런스 배열에 보관해 둔다.
    movieList.add(movie);
    System.out.println("저장하였습니다.");
  }


  public void listMovie() {
    Object[] arr = this.movieList.toArray();
    for (Object obj : arr) {
      Movie m = (Movie) obj; //형변환 하기 위해 넣은 내용..
      System.out.printf("%d. %s, %s, %s, %s\n",
          m.getNo(), m.getTitle(), m.getGenre(),
          m.getStar(), m.getMyRating());
    }
  }


  public void detailMovie() {
    System.out.print("영화 번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤에 남은 공백 제거

    Movie movie = (Movie) this.movieList.get(no);  // 게시물 인덱스로 출력할 수 있도록 바꾸는 것

    if (movie == null) {
      System.out.println("영화 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("제목: %s\n", movie.getTitle());
    System.out.printf("장르: %s\n", movie.getGenre());
    System.out.printf("주연: %s\n", movie.getStar());
    System.out.printf("평점: %s\n", movie.getMyRating());

  }
}