package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class App1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("=====영어 단어장=====");
    System.out.print("번호를 입력하세요. :  ");
    int number = keyboard.nextInt();

    keyboard.nextLine();

    System.out.print("단어를 입력해 주세요. : ");
    String word = keyboard.nextLine();

    System.out.print("품사를 입력해 주세요. : ");
    String wordClass = keyboard.nextLine();

    System.out.print("의미를 입력해 주세요. : ");
    String meaning = keyboard.nextLine();

    System.out.print("예문을 입력해 주세요. : ");
    String example = keyboard.nextLine();

    System.out.println();

    Date today = new Date(System.currentTimeMillis());
    System.out.println("저장일 : " + today);
    System.out.printf("번호 : %d\n", number);
    System.out.printf("단어 : %s\n", word);
    System.out.printf("품사 : %s\n", wordClass);
    System.out.printf("의미 : %s\n", meaning);
    System.out.printf("예문 : %s\n", example);

    keyboard.close();


  }
}