package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {

  static final int MEMBER_SIZE = 1000;
  static Member[] members = new Member[MEMBER_SIZE];
  static int memberCount = 0;
  public static Scanner keyboard;


  public static void addMember() {

    Member member = new Member();

    System.out.print("번호? ");
    member.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.name = keyboard.nextLine();

    System.out.print("이메일? ");
    member.email = keyboard.nextLine();

    System.out.print("암호? ");
    member.password = keyboard.nextLine();

    System.out.print("사진? ");
    member.photo = keyboard.nextLine();

    System.out.print("연락처? ");
    member.tel = keyboard.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis());

    members[memberCount++] = member;
    System.out.println("저장하였습니다.");

  }

  public static void listMember() {
    for (int i = 0; i < memberCount; i++) {
      Member m = members[i];
      System.out.printf("%d. %s / %s / %s / %s\n",
          m.no, m.name, m.email, m.tel,
          m.registeredDate);
    }
  }

  public static void detailMember() {
    System.out.print("회원 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 숫자 뒤에 남은 공백 제거

    Member member = null; // 회원 인덱스번호 말고 회원 번호로 출력할 수 있도록 바꾸는 것
    for (int i = 0; i < memberCount; i++) {
      if (members[i].no == no) {
        member = members[i];
        break;
      }
    }

    if (member == null) {
      System.out.println("회원 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("암호: %s\n", member.password);
    System.out.printf("사진: %s\n", member.photo);
    System.out.printf("연락처: %s\n", member.tel);
  }
}
