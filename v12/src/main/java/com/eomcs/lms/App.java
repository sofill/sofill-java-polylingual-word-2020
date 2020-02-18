package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.lms.handler.MovieHandler;
import com.eomcs.lms.handler.MovieHandler2;
import com.eomcs.lms.handler.WordHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    MovieHandler.keyboard = keyboard;
    MovieHandler2.keyboard = keyboard;
    WordHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;

    String command;
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      switch (command) {
        case "movie/add":
          MovieHandler.addMovie();
          break;
        case "movie/list":
          MovieHandler.listMovie();
          break;
        case "movie/detail":
          MovieHandler.detailMovie();
          break;
        case "movie2/add":
          MovieHandler2.addMovie();
          break;
        case "movie2/list":
          MovieHandler2.listMovie();
          break;
        case "movie2/detail":
          MovieHandler2.detailMovie();
          break;
        case "word/add":
          WordHandler.addWord();
          break;
        case "word/list":
          WordHandler.listWord();
          break;
        case "word/detail":
          WordHandler.detailWord();
          break;
        case "member/add" :
          MemberHandler.addMember();
          break;
        case "member/list" :
          MemberHandler.listMember();
          break;
        case "member/detail":
          MemberHandler.detailMember();
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



