package com.sofillpolylangmanager;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public class App1 {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
  
      class Word {
        int number;
        String word;
        String lang;
        String wordClass;
        String meaning;
        String example;
      }
      
      final int SIZE = 500;
      Word[] arrWord = new Word[SIZE]; // 레퍼런스 배열
      
  
      System.out.println("=====나의 단어장=====");
  
      int count = 0;
      for (int i = 0; i < SIZE; i++) {
        count++;
        Word temp = new Word(); // 인스턴스 생성
        
        System.out.print("번호: ");
        temp.number = keyboard.nextInt();
        keyboard.nextLine();
  
        System.out.print("언어: ");
        temp.lang = keyboard.nextLine();
        
        System.out.print("단어: ");
        temp.word = keyboard.nextLine();
        
        System.out.print("품사: ");
        temp.wordClass = keyboard.nextLine();
  
        System.out.print("의미: ");
        temp.meaning = keyboard.nextLine();
  
        System.out.print("예문: ");
        temp.example = keyboard.nextLine();
  
        arrWord[i] = temp;
        
        System.out.println("계속 입력하시겠습니까? (Y/n) ");
        String response = keyboard.nextLine();
        if (!response.equalsIgnoreCase("y"))
          break;
      }
  
      System.out.println();
      Date today = new Date(System.currentTimeMillis());
      System.out.println("저장일 : " + today);
  
  
      for (int i = 0; i < count; i++) {
        System.out.printf("%d. 언어 : %s / 단어 : %s / 품사 : %s / 의미 : %s / 예문 : %s\n", arrWord[i].number, arrWord[i].lang, arrWord[i].word, arrWord[i].wordClass, arrWord[i].meaning, arrWord[i].example); 
      }
      keyboard.close();
    }
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class Word {
      int number;
      String word;
      String lang;
      String wordClass;
      String meaning;
      String example;
    }
    
    final int SIZE = 500;
    Word[] arrWord = new Word[SIZE]; // 레퍼런스 배열
    

    System.out.println("=====나의 단어장=====");

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      Word temp = new Word(); // 인스턴스 생성
      
      System.out.print("번호: ");
      temp.number = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("언어: ");
      temp.lang = keyboard.nextLine();
      
      System.out.print("단어: ");
      temp.word = keyboard.nextLine();
      
      System.out.print("품사: ");
      temp.wordClass = keyboard.nextLine();

      System.out.print("의미: ");
      temp.meaning = keyboard.nextLine();

      System.out.print("예문: ");
      temp.example = keyboard.nextLine();

      arrWord[i] = temp;
      
      System.out.println("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    System.out.println();
    Date today = new Date(System.currentTimeMillis());
    System.out.println("저장일 : " + today);


    for (int i = 0; i < count; i++) {
      System.out.printf("%d. 언어 : %s / 단어 : %s / 품사 : %s / 의미 : %s / 예문 : %s\n", arrWord[i].number, arrWord[i].lang, arrWord[i].word, arrWord[i].wordClass, arrWord[i].meaning, arrWord[i].example); 
    }
    keyboard.close();
  }
}