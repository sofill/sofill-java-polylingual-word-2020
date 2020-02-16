package com.sofillmovielang;

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
    Member[] arrMember = new Member[SIZE];

    System.out.println("=====회원 등록=====");

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;
      Member temp = new Member();

      System.out.print("아이디: ");
      temp.id = keyboard.nextLine();

      System.out.print("이름: ");
      temp.name = keyboard.nextLine();

      System.out.print("이메일: ");
      temp.email = keyboard.nextLine();

      System.out.print("암호: ");
      temp.password = keyboard.nextLine();

      System.out.print("암호 확인: ");
      temp.password2 = keyboard.nextLine();

      System.out.print("주소: ");
      temp.address = keyboard.nextLine();

      System.out.print("연락처: ");
      temp.phoneNumber = keyboard.nextLine();

      arrMember[i] = temp;

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
      System.out.printf("1.아이디 - %s\n", arrMember[i].id);
      System.out.printf("2.이름 - %s\n", arrMember[i].name);
      System.out.printf("3.이메일 - %s\n", arrMember[i].email);
      System.out.printf("4.암호 - %s\n", arrMember[i].password);
      System.out.printf("5.암호 확인 - %s\n", arrMember[i].password2);
      System.out.printf("6.주소 - %s\n", arrMember[i].address);
      System.out.printf("7.연락처 - %s\n", arrMember[i].phoneNumber);
      System.out.println();
    }
    System.out.println("================================= ");
    Date today = new Date(System.currentTimeMillis());
    System.out.println("                저장일 : " + today);
    System.out.println();

    keyboard.close();
  }
}
