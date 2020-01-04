package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.Member;

public class MemberHandler {
  
  static final int MEMBER_SIZE = 500;
  // Member 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 
  static Member[]  arrMember = new Member[MEMBER_SIZE];
  static int member_count = 0;
  
  // 다른 패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다. 
  public static Scanner keyboard;
  
  public static void addMember() { //여기도  public으로..

    System.out.println("=====회원 등록=====");
    System.out.println();
    for (int i = 0; i < MEMBER_SIZE; i++) {
      
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
      
      // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 레퍼런스 배열에 보관해 둔다.
      arrMember[member_count++] = temp;

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = keyboard.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  }

  public static void listMember() {
    for (int i = 0; i < member_count; i++) {
      Member temp = arrMember[i];
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.아이디 - %s\n", temp.id);
      System.out.printf("2.이름 - %s\n", temp.name);
      System.out.printf("3.이메일 - %s\n", temp.email);
      System.out.printf("4.암호 - %s\n", temp.password);
      System.out.printf("5.암호 확인 - %s\n", temp.password2);
      System.out.printf("6.주소 - %s\n", temp.address);
      System.out.printf("7.연락처 - %s\n", temp.phoneNumber);
      System.out.println();
    }
    System.out.println("================================= ");
    Date today3 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today3);
    System.out.println();
  }

}
