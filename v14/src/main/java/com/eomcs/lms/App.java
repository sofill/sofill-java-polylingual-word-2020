package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.lms.handler.MovieHandler;
import com.eomcs.lms.handler.WordHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    //    MovieHandler.keyboard = keyboard;
    //    WordHandler.keyboard = keyboard;
    //    MemberHandler.keyboard = keyboard;

    // XxxHandler 의 메서드가 사용할 메모리만 게시판마다 따로 생성한다.
    MovieHandler 영화 = new MovieHandler(keyboard);
    WordHandler 단어 = new WordHandler(keyboard);
    MemberHandler 회원 = new MemberHandler(keyboard);

    String command;
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      System.out.println();

      switch (command) {
        case "1": 영화.addMovie();
        break;
        case "2": 영화.listMovie();
        break;
        case "3": 영화.detailMovie();
        break;
        case "4": 단어.addWord();
        break;
        case "5": 단어.listWord();
        break;
        case "6": 단어.detailWord();
        break;
        case "7": 회원.addMember();
        break;
        case "8": 회원.listMember();
        break;
        case "9": 회원.detailMember();
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



