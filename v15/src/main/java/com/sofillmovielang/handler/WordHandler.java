package com.sofillmovielang.handler;

import java.sql.Date;
import java.util.Scanner;
import com.sofillmovielang.domain.Word;

public class WordHandler {

  Word[] arrWord; // 생성자로 뒷부분 이동
  int word_count = 0;

  static final int WORD_SIZE = 500;
  Scanner input; // 이제는 public일 필요가 없다. 생성자에서만 사용.

  //생성자
  public WordHandler(Scanner input) {
    this.input = input; //초기화
    this.arrWord = new Word[WORD_SIZE];
  } //생성자

  public void addWord() {
    System.out.println("=====영화 속 몰랐던 단어=====");
    System.out.println();
    for (int i = 0; i < WORD_SIZE; i++) {

      Word temp = new Word(); // 인스턴스 생성

      System.out.print("1.제목: ");
      temp.setTitle(input.nextLine());

      System.out.print("2.언어: ");
      temp.setLang(input.nextLine());

      System.out.print("3.단어: ");
      temp.setWord(input.nextLine());

      System.out.print("4.의미: ");
      temp.setMeaning(input.nextLine());

      System.out.print("5.품사: ");
      temp.setWordClass(input.nextLine());

      System.out.print("6.인용: ");
      temp.setQuote(input.nextLine());

      System.out.print("7.번역: ");
      temp.setTranslation(input.nextLine());

      System.out.print("8.메모: ");
      temp.setMemo(input.nextLine());

      // 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다. 
      this.arrWord[this.word_count++] = temp; //여기를 변경

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String response = input.nextLine();

      System.out.println();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println("-------------------");
      System.out.println();
    }
  } 

  public void listWord() {
    for (int i = 0; i < this.word_count; i++) {
      Word a = this.arrWord[i];
      System.out.println("================================= ");
      System.out.println();
      System.out.printf("1.제목 - %s\n", a.getLang());
      System.out.printf("3.단어 - %s\n", a.getWord());
      System.out.printf("4.의미 - %s\n", a.getMeaning());
      System.out.printf("5.품사 - %s\n", a.getWordClass());
      System.out.printf("6.인용 - %s\n", a.getQuote());
      System.out.printf("7.번역 - %s\n", a.getTranslation());
      System.out.printf("8.메모 - %s\n", a.getMemo()); 
      System.out.println();
    }
    System.out.println("================================= ");
    Date today2 = new Date(System.currentTimeMillis());
    System.out.println("                출력일 : " + today2);
    System.out.println();
  }

}
