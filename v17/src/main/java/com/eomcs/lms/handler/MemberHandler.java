package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {

  ArrayList memberList;

  Scanner input;


  public MemberHandler(Scanner input) {
    this.input = input;
    memberList = new ArrayList();
  }

  public MemberHandler(Scanner input, int capacity) {
    this.input = input;
    memberList = new ArrayList(capacity);
  }


  public void addMember() {
    // 레퍼런스
    Member member = new Member();

    System.out.print("번호? ");
    member.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.setName(input.nextLine());

    System.out.print("이메일? ");
    member.setEmail(input.nextLine());

    System.out.print("암호? ");
    member.setPassword(input.nextLine());

    System.out.print("사진? ");
    member.setPhoto(input.nextLine());

    System.out.print("연락처? ");
    member.setTel(input.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    memberList.add(member);
    System.out.println("저장하였습니다.");
  }

  public void listMember() {
    Object[] arr = this.memberList.toArray();
    for (Object obj : arr) {
      Member m = (Member) obj; //형변환 하기 위해 넣은 내용...
      System.out.printf("%d. %s / %s / %s / %s\n",
          m.getNo(), m.getName(), m.getEmail(), m.getTel(),
          m.getRegisteredDate());
    }
  }

  public void detailMember() {
    System.out.print("회원 번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤에 남은 공백 제거

    Member member = (Member) this.memberList.get(no); // 회원 인덱스번호 말고 회원 번호로 출력할 수 있도록 바꾸는 것

    if (member == null) {
      System.out.println("회원 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("암호: %s\n", member.getPassword());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("연락처: %s\n", member.getTel());
  }
}
