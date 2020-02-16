package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class Word {
      String title;
      String lang;
      String word;
      String wordClass;
      String meaning;
      String quote;
      String translation;
      String memo;
    }

    final int SIZE = 500;
    Word[] arrWord = new Word[SIZE]; // 레퍼런스 배열


    System.out.println("=====영화 속 몰랐던 단어=====");

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      
      count++;
      
      Word word = new Word(); // 인스턴스 생성

      System.out.print("제목: ");
      word.title = keyboard.nextLine();

      System.out.print("언어: ");
      word.lang = keyboard.nextLine();

      System.out.print("단어: ");
      word.word = keyboard.nextLine();

      System.out.print("의미: ");
      word.meaning = keyboard.nextLine();

      System.out.print("품사: ");
      word.wordClass = keyboard.nextLine();

      System.out.print("인용: ");
      word.quote = keyboard.nextLine();

      System.out.print("번역: ");
      word.translation = keyboard.nextLine();

      System.out.print("메모: ");
      word.memo = keyboard.nextLine();

      arrWord[i] = word;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println();
    }

    for (int i = 0; i < count; i++) {
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
    Date today = new Date(System.currentTimeMillis());
    System.out.println("                저장일 : " + today);
    System.out.println();

    keyboard.close();
  }
}
