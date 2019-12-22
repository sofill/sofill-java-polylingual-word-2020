package com.sofillpolylangmanager;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class Member {
      String id;
      String name;
      String email;
      String password;
      String password2;
      String address;
      String phoneNumber;
    }

    final int SIZE = 500;
    Member[]  arrMember = new Member[SIZE];

    System.out.println("=====회원가입=====");

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      Member temp = new Member();

      System.out.print("아이디를 입력하세요. : ");
      temp.id = keyboard.nextLine();

      System.out.print("이름을 입력하세요. : ");
      temp.name = keyboard.nextLine();

      System.out.print("이메일 주소를 입력하세요. : ");
      temp.email = keyboard.nextLine();

      System.out.print("암호를 입력하세요. : ");
      temp.password = keyboard.nextLine();

      System.out.print("암호를 다시 입력하세요. : ");
      temp.password2 = keyboard.nextLine();

      System.out.print("주소를 입력하세요.  : ");
      temp.address = keyboard.nextLine();

      System.out.print("연락처를 입력하세요. : ");
      temp.phoneNumber = keyboard.nextLine();

      arrMember[i] = temp;

      System.out.println("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }

    System.out.println();
    Date today = new Date(System.currentTimeMillis());
    System.out.println("저장일 : " + today);

    for (int i = 0; i < count; i++) {
      System.out.printf("ID : %s / 이름 : %s / 이메일 : %s / 암호 : %s / 주소 : %s / 연락처 : %s\n", arrMember[i].id, arrMember[i].name, arrMember[i].email, arrMember[i].password, arrMember[i].address, arrMember[i].phoneNumber); 
    }
    keyboard.close();
  }
}
