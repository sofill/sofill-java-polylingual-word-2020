package com.sofillmovielang;

import java.sql.Date;
import java.util.Scanner;

public class MemberHandler {

  static class Member {
    int no;
    String id;
    String name;
    String email;
    String password;
    String password2;
    String address;
    String phoneNumber;
  }
  static final int MEMBER_SIZE = 500;
  static Member[] arrMember = new Member[MEMBER_SIZE];  // 레퍼런스 배열
  static int member_Count = 0;
  static Scanner keyboard;


  static void addMember() {

    Member members = new Member(); // 인스턴스 생성

    for (int i = 0; i < MEMBER_SIZE; i++) {
      member_Count++;

      System.out.print("번호: ");
      members.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("아이디: ");
      members.id = keyboard.nextLine();

      System.out.print("이름: ");
      members.name = keyboard.nextLine();

      System.out.print("이메일: ");
      members.email = keyboard.nextLine();

      System.out.print("암호: ");
      members.password = keyboard.nextLine();

      System.out.print("암호 확인: ");
      members.password2 = keyboard.nextLine();

      System.out.print("주소: ");
      members.address = keyboard.nextLine();

      System.out.print("연락처: ");
      members.phoneNumber = keyboard.nextLine();

      arrMember[i] = members;

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
    System.out.println("=====회원 등록=====");
    System.out.println();
    for (int i = 0; i < member_Count; i++) {
      Member mb = arrMember[i];
      System.out.printf("%d. %s, %s, %s, %s, %s, %s, %s\n", mb.no, mb.id, mb.name, mb.email, mb.password, mb.password2, mb.address, mb.phoneNumber);
    }
    System.out.println();
    Date today3 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today3);
  }
}
