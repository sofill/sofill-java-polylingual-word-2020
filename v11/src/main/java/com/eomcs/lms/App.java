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
        case "word/add":
          WordHandler.addWord();
          break;
        case "word/list":
          WordHandler.listWord();
          break;
        case "member/add" :
          MemberHandler.addMember();
          break;
        case "member/list" :
          MemberHandler.listMember();
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



