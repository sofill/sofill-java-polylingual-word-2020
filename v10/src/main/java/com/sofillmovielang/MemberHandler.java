package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class MemberHandler {
  static class Member {
    String id;
    String name;
    String email;
    String password;
    String password2;
    String address;
    String phoneNumber;
  }
  static final int MEMBER_SIZE = 500;
  static Member[]  arrMember = new Member[MEMBER_SIZE];
  static int member_count = 0;
  static Scanner keyboard;
  
  static void addMember() {

    System.out.println("=====회원 등록=====");
    System.out.println();
    for (int i = 0; i < MEMBER_SIZE; i++) {
      member_count++;
      Member temp = new Member();

      System.out.print("1.아이디: ");
      temp.id = keyboard.nextLine();

      System.out.print("2.이름: ");
      temp.name = keyboard.nextLine();

      System.out.print("3.이메일: ");
      temp.email = keyboard.nextLine();

      System.out.print("4.암호: ");
      temp.password = keyboard.nextLine();

      System.out.print("5.암호 확인: ");
      temp.password2 = keyboard.nextLine();

      System.out.print("6.주소: ");
      temp.address = keyboard.nextLine();

      System.out.print("7.연락처: ");
      temp.phoneNumber = keyboard.nextLine();

      arrMember[i] = temp;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  }

  static void listMember() {
    for (int i = 0; i < member_count; i++) {
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
    Date today3 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today3);
    System.out.println();
  }

}
