package com.sofillpolylangmanager;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 500;
    int[] number = new int[SIZE];
    String[] word = new String[SIZE];
    String[] wordClass = new String[SIZE];
    String[] meaning = new String[SIZE];
    String[] example = new String[SIZE];

    System.out.println("=====일본어 단어장=====");

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      System.out.print("번호를 입력하세요. :  ");
      number[i] = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("단어를 입력해 주세요. : ");
      word[i] = keyboard.nextLine();

      System.out.print("품사를 입력해 주세요. : ");
      wordClass[i] = keyboard.nextLine();

      System.out.print("의미를 입력해 주세요. : ");
      meaning[i] = keyboard.nextLine();

      System.out.print("예문을 입력해 주세요. : ");
      example[i] = keyboard.nextLine();

      System.out.println("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    System.out.println();
    Date today = new Date(System.currentTimeMillis());
    System.out.println("저장일 : " + today);


      for (int i = 0; i < count; i++) {
        System.out.printf("번호 : %d / 단어 : %s / 품사 : %s / 의미 : %s / 예문 : %s\n", number[i], word[i], wordClass[i], meaning[i], example[i]); 
      }
      keyboard.close();
    }
  }