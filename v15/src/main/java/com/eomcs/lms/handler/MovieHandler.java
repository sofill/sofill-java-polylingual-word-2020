package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Movie;

public class MovieHandler {

  // 인스턴스 필드 = 논스태틱 필드
  Movie[] movies = new Movie[MOVIE_SIZE];
  int movieCount = 0;

  // 이전까지 게시물 데이터를 입력 받을 떄 키보드에서 입력 받았지만
  // 향후 네트워크로부터도 입력 받을 수 있기 때문에
  // 이런 경우를 대비하여 입력 데이터를 읽는 것을 keyboard 로 한정하지 말자!
  // 또한 각 게시판마다 입력 받는 방식을 다르게 할 수 있도록 인스턴스 변수로 선언하자.
  public Scanner input;

  // 클래스 필드 = 스태틱 필드
  // 공유할 변수
  static final int MOVIE_SIZE = 1000;

  // 생성자
  // => 인스턴스를 생성할 때 반드시 호출되는 메서드
  // => new 명령을 실행할 때, 호출될 생성자를 지정할 수 있다.
  // => 주로 '의존 객체를 초기화시키는' 코드를 넣는다.
  // => 생성자는 리턴 값이 없고, '클래스 이름과 같은 이름으로 메서드를 정의'한다.
  // => 생성자를 실행할 때 사용할 값은 파라미터로 받는다. (keyboard)
  public MovieHandler(Scanner input) {
    // BoardHandler 를 실행하려면 데이터를 입력 받는 도구가 반드시 있어야 한다.
    // 이런 도구를 "의존 객체(dependency object)"라 부른다.
    // 보통 "dependency"라 부른다.
    // 생성자에서 해야할 일은 "인스턴스를 생성할 때 이런 의존 객체를 반드시 초기화"시키도록 하는 것이다.
    this.input = input; // 초기화
  }

  public MovieHandler(Scanner input, int capacity) {
    this.input = input;
    if (capacity < MOVIE_SIZE || capacity > 10000)
      this.movies = new Movie[MOVIE_SIZE];
    else
      this.movies = new Movie[capacity];
  }


  // 인스턴스 메서드
  // => 인스턴스가 있어야만 호출할 수 있는 메서드이다.
  // => 인스턴스를 사용하는 메서드인 경우 인스턴스 메서드로 선언하라.
  // => 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  //        인스턴스주소.메서드명();

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
    this.movies[this.movieCount++] = movie; //여기를 변경
    System.out.println("저장하였습니다.");
  }


  public void listMovie() {
    for (int i = 0; i < this.movieCount; i++) {
      Movie m = this.movies[i];
      System.out.printf("%d. %s, %s, %s, %s\n",
          m.getNo(), m.getTitle(), m.getGenre(),
          m.getStar(), m.getMyRating());
    }
  }


  public void detailMovie() {
    System.out.print("영화 번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤에 남은 공백 제거

    Movie movie = null; // 게시물 인덱스번호 말고 게시물 번호로 출력할 수 있도록 바꾸는 것
    for (int i = 0; i < this.movieCount; i++) {
      if (this.movies[i].getNo() == no) {
        movie = this.movies[i];
        break;
      }
    }

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