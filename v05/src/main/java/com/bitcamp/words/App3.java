package com.sofillpolylangmanager;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("=====회원가입=====");
    System.out.print("아이디를 입력하세요. : ");
    String id = keyboard.nextLine();
    
    System.out.print("이름을 입력하세요. : ");
    String name = keyboard.nextLine();

    System.out.print("이메일 주소를 입력하세요. : ");
    String email = keyboard.nextLine();

    System.out.print("암호를 입력하세요. : ");
    String password = keyboard.nextLine();

    System.out.print("암호를 다시 입력하세요. : ");
    String password2 = keyboard.nextLine();

    System.out.print("주소를 입력하세요.  : ");
    String address = keyboard.nextLine();

    System.out.print("연락처를 입력하세요. : ");
    String phoneNumber = keyboard.nextLine();

    
    
    System.out.println();

    Date today = new Date(System.currentTimeMillis());
    System.out.println("가입일 : " + today);
    System.out.printf("아이디 : %s\n", id);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("이메일 : %s\n", email);
    System.out.printf("암호 : %s\n", password);
    System.out.printf("주소 : %s\n", address);
    System.out.printf("연락처 : %s\n", phoneNumber);

    keyboard.close();
  }
}
