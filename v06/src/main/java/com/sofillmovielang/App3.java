package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 500;

    String[] id = new String[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] password = new String[SIZE];
    String[] password2 = new String[SIZE];
    String[] address = new String[SIZE];  
    String[] phoneNumber = new String[SIZE];



    System.out.println("=====회원가입=====");

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      System.out.print("아이디를 입력하세요. : ");
      id[i] = keyboard.nextLine();

      System.out.print("이름을 입력하세요. : ");
      name[i] = keyboard.nextLine();

      System.out.print("이메일 주소를 입력하세요. : ");
      email[i] = keyboard.nextLine();

      System.out.print("암호를 입력하세요. : ");
      password[i] = keyboard.nextLine();

      System.out.print("암호를 다시 입력하세요. : ");
      password2[i] = keyboard.nextLine();

      System.out.print("주소를 입력하세요.  : ");
      address[i] = keyboard.nextLine();

      System.out.print("연락처를 입력하세요. : ");
      phoneNumber[i] = keyboard.nextLine();

      System.out.println("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    System.out.println();
    Date today = new Date(System.currentTimeMillis());
    System.out.println("저장일 : " + today);
    
    for (int i = 0; i < count; i++) {
      System.out.printf("ID : %s / 이름 : %s / 이메일 : %s / 암호 : %s / 주소 : %s / 연락처 : %s\n", id[i], name[i], email[i], password[i], address[i], phoneNumber[i]); 
    }
    keyboard.close();
  }
}
