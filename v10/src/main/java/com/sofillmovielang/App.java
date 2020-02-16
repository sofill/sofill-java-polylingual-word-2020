package com.sofillmovielang;

import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    // 각 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해 준다.
    MovieHandler.keyboard = keyboard;
    WordHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;

    String command;

    do {
      System.out.print("명령> ");
      command = keyboard.nextLine();
      switch (command){
        case "/movie/add":
          MovieHandler.addMovie();
          break;
        case "/movie/list":
          MovieHandler.listMovie();
          break;
        case "/word/add":
          WordHandler.addWord();
          break;
        case "/word/list":
          WordHandler.listWord();
          break;
        case "/member/add":
          MemberHandler.addMember();
          break;
        case "/member/list":
          MemberHandler.listMember();
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
}

