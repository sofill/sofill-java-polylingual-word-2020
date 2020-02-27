package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {

  // 인스턴스 필드 = 논스태틱 필드
  Member[] members;
  int memberCount = 0;

  // 클래스 필드 = 스태틱 필드
  static final int MEMBER_SIZE = 1000;
  Scanner input; // 이제는 public일 필요가 없다. 생성자에서만 사용.

  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[MEMBER_SIZE];
  }

  // 인스턴스 메서드
  // => 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  //      인스턴스주소.메서드명();
  public void addMember() {
    // 레퍼런스
    Member member = new Member();

    System.out.print("번호? ");
    member.no = input.nextInt();
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.name = input.nextLine();

    System.out.print("이메일? ");
    member.email = input.nextLine();

    System.out.print("암호? ");
    member.password = input.nextLine();

    System.out.print("사진? ");
    member.photo = input.nextLine();

    System.out.print("연락처? ");
    member.tel = input.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis());

    this.members[memberCount++] = member;
    System.out.println("저장하였습니다.");

  }

  public void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d. %s / %s / %s / %s\n",
          m.no, m.name, m.email, m.tel,
          m.registeredDate);
    }
  }

  public void detailMember() {
    System.out.print("회원 번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤에 남은 공백 제거

    Member member = null; // 회원 인덱스번호 말고 회원 번호로 출력할 수 있도록 바꾸는 것
    for (int i = 0; i < this.memberCount; i++) {
      if (this.members[i].no == no) {
        member = this.members[i];
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
