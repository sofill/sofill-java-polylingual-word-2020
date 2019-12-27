package com.sofillmovielang;

import java.util.Scanner;
import com.sofillmovielang.handler.MemberHandler;
import com.sofillmovielang.handler.MovieHandler;
import com.sofillmovielang.handler.WordHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    // 내가 설정한 3개의 메서드를 사용하기 전에
    // 그 메서드가 작업시 사용할 키보드 객체를 설정해 줘야 한다.
    MovieHandler.keyboard = keyboard;
    WordHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;

    // BoardHandler의 메서드가 사용할 메모리만 게시판마다 따로 생성한다.
    MovieHandler 조회1 = new MovieHandler();
    MovieHandler 조회2 = new MovieHandler();
    MovieHandler 조회3 = new MovieHandler();
    MovieHandler 조회4 = new MovieHandler();
    MovieHandler 조회5 = new MovieHandler();
    MovieHandler 조회6 = new MovieHandler();

    WordHandler 단어정리 = new WordHandler();
    MemberHandler 회원가입 = new MemberHandler();
    //
    String command;
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      System.out.println();

      switch (command){
        case "movie1/add": 조회1.addMovie();
        break;
        case "movie1/list": 조회1.listMovie();
        break;
        case "movie1/detail": 조회1.detailMovie();
        break;
        case "movie2/add": 조회2.addMovie();
        break;
        case "movie2/list": 조회2.listMovie();
        break;
        case "movie2/detail": 조회2.detailMovie();
        break;
        case "movie3/add": 조회3.addMovie();
        break;
        case "movie3/list": 조회3.listMovie();
        break;
        case "movie3/detail": 조회3.detailMovie();
        break;          
        case "movie4/add": 조회4.addMovie();
        break;
        case "movie4/list": 조회4.listMovie();
        break;
        case "movie4/detail": 조회4.detailMovie();
        break;
        case "movie5/add": 조회5.addMovie();
        break;
        case "movie5/list": 조회5.listMovie();
        break;
        case "movie5/detail": 조회5.detailMovie();
        break;
        case "movie6/add": 조회6.addMovie();
        break;
        case "movie6/list": 조회6.listMovie();
        break;
        case "movie6/detail": 조회6.detailMovie();
        break;

        case "word/add": 단어정리.addWord();
        break;
        case "word/list": 단어정리.listWord();
        break;

        case "member/add": 회원가입.addMember();
        break;
        case "member/list": 회원가입.listMember();
        break;

        default:

          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다." );
          }
      }
    } while(!command.equalsIgnoreCase("quit"));

    System.out.println("잘가요~!");

    keyboard.close();
  }

}

