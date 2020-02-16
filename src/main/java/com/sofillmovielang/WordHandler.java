package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class WordHandler {

  static class Word {
    int no;
    String title;
    String lang;
    String word;
    String wordClass;
    String meaning;
  }

  static final int WORD_SIZE = 500;
  static Word[] arrWord = new Word[WORD_SIZE]; // 레퍼런스 배열
  static int word_Count = 0;
  static Scanner keyboard;


  static void addWord() {

    Word words = new Word(); // 인스턴스 생성

    for (int i = 0; i < WORD_SIZE; i++) {
      word_Count++;

      System.out.print("번호: ");
      words.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("영화 제목: ");
      words.title = keyboard.nextLine();

      System.out.print("언어 종류: ");
      words.lang = keyboard.nextLine();

      System.out.print("단어: ");
      words.word = keyboard.nextLine();

      System.out.print("품사: ");
      words.wordClass = keyboard.nextLine();

      System.out.print("뜻: ");
      words.meaning = keyboard.nextLine();
      System.out.println();

      arrWord[i] = words;

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

    System.out.println("=====영화 속 몰랐던 단어=====");
    System.out.println();
    for (int i = 0; i < word_Count; i++) {
      Word w = arrWord[i];
      System.out.printf("%d. %s, %s, %s, %s, %s\n", w.no, w.title, w.lang, w.word,  w.wordClass, w.meaning);
    }
    System.out.println();
    Date today2 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today2);
  }
}
