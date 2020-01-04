package com.sofillmovielang;

import java.util.Scanner;
import com.sofillmovielang.handler.MemberHandler;
import com.sofillmovielang.handler.MovieHandler;
import com.sofillmovielang.handler.MovieHandler2;
import com.sofillmovielang.handler.WordHandler;

public class App {
  // 메인 바깥으로 보낼 때 static 붙이는 이유 : 다른 메서드들과 공유하기 위한 표시
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    
    // 내가 설정한 3개의 메서드를 사용하기 전에
    // 그 메서드가 작업시 사용할 키보드 객체를 설정해 줘야 한다.
    MovieHandler.keyboard = keyboard;
    MovieHandler2.keyboard = keyboard;
    WordHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;

    String command;
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      System.out.println();

      switch (command){
        case "movie/add":
          // 분리된 코드(메서드)를 실행(호출)시킨다.
          // 메서드 호출; method call
          MovieHandler.addMovie();
          break;
        case "movie/list":
          MovieHandler.listMovie();
          break;
//        case "movie/detail":
//          MovieHandler.detailMovie();
//          break;
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
        case "member/add":
          MemberHandler.addMember();
          break;
        case "member/list":
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
  }

}

