package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.Member;

public class MemberHandler {

  ///필드///
  Scanner input; // 이제는 public일 필요가 없다. 생성자에서만 사용.
  MemberList memberList;

  ///생성자///
  public MemberHandler(Scanner input) {
    this.input = input; //초기화
    this.memberList = new MemberList();//위 배열의 레퍼런스 주소를 생성
  } 
  
  public MemberHandler(Scanner input, int size) {
    this.input = input;
    this.memberList = new MemberList(size);
  }

  public void addMember() { //여기도  public으로..

    System.out.println("=====회원 등록=====");
    System.out.println();
    for (int i = 0; i < MemberList.MEMBER_SIZE; i++) {

      Member temp = new Member(); // 인스턴스 생성

      System.out.print("1.아이디: ");
      temp.setId(input.nextLine());
      System.out.print("2.이름: ");
      temp.setName(input.nextLine());
      System.out.print("3.이메일: ");
      temp.setEmail(input.nextLine());
      System.out.print("4.암호: ");
      temp.setPassword(input.nextLine());
      System.out.print("5.암호 확인: ");
      temp.setPassword2(input.nextLine());
      System.out.print("6.주소: ");
      temp.setAddress(input.nextLine());
      System.out.print("7.연락처: ");
      temp.setPhoneNumber(input.nextLine());

      // 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 레퍼런스 배열에 보관해 둔다. // MemberList의 add 메서드
      memberList.add(temp); // 여기를 변경..

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = input.nextLine();
      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  }

  public void listMember() {
    for (int i = 0; i < memberList.size; i++) {
      Member temp = memberList.toArray()[i];
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.아이디 - %s\n", temp.getId());
      System.out.printf("2.이름 - %s\n", temp.getName());
      System.out.printf("3.이메일 - %s\n", temp.getEmail());
      System.out.printf("4.암호 - %s\n", temp.getPassword());
      System.out.printf("5.암호 확인 - %s\n", temp.getPassword2());
      System.out.printf("6.주소 - %s\n", temp.getAddress());
      System.out.printf("7.연락처 - %s\n", temp.getPhoneNumber());
      System.out.println();
    }
    System.out.println("================================= ");
    Date today3 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today3);
    System.out.println();
  }

}
