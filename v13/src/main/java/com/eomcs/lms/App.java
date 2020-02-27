package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.lms.handler.MovieHandler;
import com.eomcs.lms.handler.WordHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    MovieHandler.keyboard = keyboard;
    WordHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;

    // XxxHandler 의 메서드가 사용할 메모리만 게시판마다 따로 생성한다.
    MovieHandler 영화 = new MovieHandler();
    WordHandler 단어 = new WordHandler();
    MemberHandler 회원 = new MemberHandler();


    String command;
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      switch (command) {
        case "movie/add":
          영화.addMovie();
          break;
        case "movie/list":
          영화.listMovie();
          break;
        case "movie/detail":
          영화.detailMovie();
          break;
        case "word/add":
          단어.addWord();
          break;
        case "word/list":
          단어.listWord();
          break;
        case "word/detail":
          단어.detailWord();
          break;
        case "member/add" :
          회원.addMember();
          break;
        case "member/list" :
          회원.listMember();
          break;
        case "member/detail":
          회원.detailMember();
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }

    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!!");

    keyboard.close();

  }
}



