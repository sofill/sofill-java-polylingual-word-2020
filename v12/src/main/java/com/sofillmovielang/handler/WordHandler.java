package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.Word;

public class WordHandler {

  
  static final int WORD_SIZE = 500;
  // Word 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 
  static Word[] arrWord = new Word[WORD_SIZE]; // 레퍼런스 배열
  static int word_count = 0;
  
  //다른 패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다. 
  public static Scanner keyboard;
  
  public static void addWord() {
    System.out.println("=====영화 속 몰랐던 단어=====");
    System.out.println();
    for (int i = 0; i < WORD_SIZE; i++) {
     
      Word temp = new Word(); // 인스턴스 생성

      System.out.print("1.제목: ");
      temp.title = keyboard.nextLine();

      System.out.print("2.언어: ");
      temp.lang = keyboard.nextLine();

      System.out.print("3.단어: ");
      temp.word = keyboard.nextLine();

      System.out.print("4.의미: ");
      temp.meaning = keyboard.nextLine();

      System.out.print("5.품사: ");
      temp.wordClass = keyboard.nextLine();

      System.out.print("6.인용: ");
      temp.quote = keyboard.nextLine();

      System.out.print("7.번역: ");
      temp.translation = keyboard.nextLine();

      System.out.print("8.메모: ");
      temp.memo = keyboard.nextLine();
      
      // 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다. 
      arrWord[word_count++] = temp; //여기를 변경

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();

      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  } 

  public static void listWord() {
    for (int i = 0; i < word_count; i++) {
      Word a = arrWord[i];
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.제목 - %s\n", a.lang);
      System.out.printf("3.단어 - %s\n", a.word);
      System.out.printf("4.의미 - %s\n", a.meaning);
      System.out.printf("5.품사 - %s\n", a.wordClass);
      System.out.printf("6.인용 - %s\n", a.quote);
      System.out.printf("7.번역 - %s\n", a.translation);
      System.out.printf("8.메모 - %s\n", a.memo); 
      System.out.println();
    }
    System.out.println("================================= ");
    Date today2 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today2);
    System.out.println();
  }
  
}
