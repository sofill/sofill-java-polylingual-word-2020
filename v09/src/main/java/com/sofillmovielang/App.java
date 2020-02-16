package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);

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



  static class Word {
    int no;
    String title;
    String lang;
    String word;
    String wordClass;
    String meaning;
  }

  static final int WORD_SIZE = 500;
  static Word[] arrWord = new Word[WORD_SIZE]; // 레퍼런스 배열
  static int word_Count = 0;



  static class Member {
    int no;
    String id;
    String name;
    String email;
    String password;
    String password2;
    String address;
    String phoneNumber;
  }
  static final int MEMBER_SIZE = 500;
  static Member[] arrMember = new Member[MEMBER_SIZE];  // 레퍼런스 배열
  static int member_Count = 0;

  public static void main(String[] args) {

    String command;



    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      System.out.println();

      switch (command){
        case "/movie/add":

          addMovie();

          break;

        case "/movie/list":

          listMovie();

          break;


        case "/word/add":

          addWord();

          break;

        case "/word/list":

          listWord();

          break;


        case "/member/add":

          addMember();

          break;

        case "/member/list":

          listMember();

          break;


        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다." );
          }
      }
    } while(!command.equalsIgnoreCase("quit"));

    System.out.println("잘가요~!");

    keyboard.close();
  } // end of main

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

  } // end of addMovie()

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
    System.out.println();

  } // end of listMovie()

  static void addWord() {

    Word words = new Word(); // 인스턴스 생성

    for (int i = 0; i < WORD_SIZE; i++) {
      word_Count++;

      System.out.print("번호: ");
      words.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("영화 제목: ");
      words.title = keyboard.nextLine();

      System.out.print("언어 종류: ");
      words.lang = keyboard.nextLine();

      System.out.print("단어: ");
      words.word = keyboard.nextLine();

      System.out.print("품사: ");
      words.wordClass = keyboard.nextLine();

      System.out.print("뜻: ");
      words.meaning = keyboard.nextLine();
      System.out.println();

      arrWord[i] = words;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();

      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }

  } // end of addWord()

  static void listWord() {

    System.out.println("=====영화 속 몰랐던 단어=====");
    System.out.println();
    for (int i = 0; i < word_Count; i++) {
      Word w = arrWord[i];
      System.out.printf("%d. %s, %s, %s, %s, %s\n", w.no, w.title, w.lang, w.word,  w.wordClass, w.meaning);
    }
    System.out.println();
    Date today2 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today2);
    System.out.println();

  } // end of listWord()

  static void addMember() {

    Member members = new Member(); // 인스턴스 생성

    for (int i = 0; i < MEMBER_SIZE; i++) {
      member_Count++;

      System.out.print("번호: ");
      members.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("아이디: ");
      members.id = keyboard.nextLine();

      System.out.print("이름: ");
      members.name = keyboard.nextLine();

      System.out.print("이메일: ");
      members.email = keyboard.nextLine();

      System.out.print("암호: ");
      members.password = keyboard.nextLine();

      System.out.print("암호 확인: ");
      members.password2 = keyboard.nextLine();

      System.out.print("주소: ");
      members.address = keyboard.nextLine();

      System.out.print("연락처: ");
      members.phoneNumber = keyboard.nextLine();

      arrMember[i] = members;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }

  } // end of addMember()

  static void listMember() {

    System.out.println("=====회원 등록=====");
    System.out.println();
    for (int i = 0; i < member_Count; i++) {
      Member mb = arrMember[i];
      System.out.printf("%d. %s, %s, %s, %s, %s, %s, %s\n", mb.no, mb.id, mb.name, mb.email, mb.password, mb.password2, mb.address, mb.phoneNumber);
    }
    System.out.println();
    Date today3 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today3);
    System.out.println();

  } // end of listMember()
}

