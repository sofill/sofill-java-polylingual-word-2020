package com.sofillmovielang;

import java.util.Scanner;
import com.sofillmovielang.handler.MemberHandler;
import com.sofillmovielang.handler.MovieHandler;
import com.sofillmovielang.handler.WordHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    MovieHandler 조회 = new MovieHandler(keyboard);
    WordHandler 단어정리 = new WordHandler(keyboard);
    MemberHandler 회원가입 = new MemberHandler(keyboard);
    //
    String command;
    do {
      System.out.print("―――――――― 나의 해외명작 컬렉션으로 외국어 공부하기  ――――――――\n"
          + "번호를 입력해 주세요. \n"
          + "    1.컬렉션입력   2.나란히보기   3.자세히보기  4.단어입력 \n"
          + "    5.단어확인      6.회원가입      7.가입확인     *종료:q\n"
          + "―――――――――――――――――――――――――――――――――――――――――\n"
          + "\n명령> ");
      command = keyboard.nextLine();
      System.out.println();
      System.out.println(
          );

      switch (command){
        case "1": 조회.addMovie();
        break;
        case "2": 조회.listMovie();
        break;
        case "3": 조회.detailMovie();
        break;

        case "4": 단어정리.addWord();
        break;
        case "5": 단어정리.listWord();
        break;

        case "6": 회원가입.addMember();
        break;
        case "7": 회원가입.listMember();
        break;

        default:

          if (!command.equalsIgnoreCase("q")) {
            System.out.println("실행할 수 없는 명령입니다." );
          }
      }
    } while(!command.equalsIgnoreCase("q"));

    System.out.println("잘가요~!");

    keyboard.close();
  }

}

