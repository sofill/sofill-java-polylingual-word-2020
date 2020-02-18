package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Word;

public class WordHandler {

  // 인스턴스 필드 = 논스태틱 필드
  Word[] words = new Word[WORD_SIZE];
  int wordCount = 0;

  // 클래스 필드 = 스태틱 필드
  static final int WORD_SIZE = 1000;
  public static Scanner keyboard;

  // 인스턴스 메서드
  public void addWord() {

    // 레퍼런스
    Word word = new Word();

    System.out.print("번호? ");
    word.no = keyboard.nextInt();
    keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("영화명? ");
    word.title = keyboard.nextLine();

    System.out.print("언어? ");
    word.language = keyboard.nextLine();

    System.out.print("단어? ");
    word.word = keyboard.nextLine();

    System.out.print("뜻? ");
    word.meaning = keyboard.nextLine();

    // 게시물 데이터가 보관된 Word 인스턴스의 주소를 레퍼런스 배열에 저장한다.
    this.words[wordCount++] = word;
    System.out.println("저장하였습니다.");
  }

  public void listWord() {
    for (int i = 0; i < this.wordCount; i++) {
      Word w = this.words[i];
      System.out.printf("%d. %s, %s, %s, %s\n",
          w.no, w.title, w.language, w.word, w.meaning);
    }
  }

  public void detailWord() {
    System.out.print("단어 번호?");
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 숫자 뒤에 남은 공백 제거

    Word word = null; // 단어 인덱스번호 말고 단어 번호로 출력할 수 있도록 바꾸는 것
    for (int i = 0; i < this.wordCount; i++) {
      if (this.words[i].no == no) {
        word = this.words[i];
        break;
      }
    }
    if (word == null) {
      System.out.println("단어 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("영화명: %s\n", word.title);
    System.out.printf("언어: %s\n", word.language);
    System.out.printf("단어: %s\n", word.word);
    System.out.printf("뜻: %s\n", word.meaning);

  }
}
