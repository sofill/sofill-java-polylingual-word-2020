package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class WordHandler {
  static class Word {
    String title;
    String lang;
    String word;
    String wordClass;
    String meaning;
    String quote;
    String translation;
    String memo;
  }
  static final int WORD_SIZE = 500;
  static Word[] arrWord = new Word[WORD_SIZE]; // 레퍼런스 배열
  static int word_count = 0;
  static Scanner keyboard;
  
  static void addWord() {
    System.out.println("=====영화 속 몰랐던 단어=====");
    System.out.println();
    for (int i = 0; i < WORD_SIZE; i++) {
      word_count++;
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

      arrWord[i] = temp;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();

      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  } 

  static void listWord() {
    for (int i = 0; i < word_count; i++) {
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.제목 - %s\n", arrWord[i].title);
      System.out.printf("2.언어 - %s\n", arrWord[i].lang);
      System.out.printf("3.단어 - %s\n", arrWord[i].word);
      System.out.printf("4.의미 - %s\n", arrWord[i].meaning);
      System.out.printf("5.품사 - %s\n", arrWord[i].wordClass);
      System.out.printf("6.인용 - %s\n", arrWord[i].quote);
      System.out.printf("7.번역 - %s\n", arrWord[i].translation);
      System.out.printf("8.메모 - %s\n", arrWord[i].memo); 
      System.out.println();
    }
    System.out.println("================================= ");
    Date today2 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today2);
    System.out.println();
  }
  
}
