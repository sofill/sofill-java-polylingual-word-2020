package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Word;

public class WordHandler {

  WordList wordList;
  Scanner input;

  public WordHandler(Scanner input) {
    this.input = input; //초기화
    wordList = new WordList();
  }

  public WordHandler(Scanner input, int capacity) {
    this.input = input;
    wordList = new WordList(capacity);
  }


  public void addWord() {
    // 레퍼런스
    Word word = new Word();

    System.out.print("번호? ");
    word.setNo(input.nextInt());
    input.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("영화명? ");
    word.setTitle(input.nextLine());

    System.out.print("언어? ");
    word.setLanguage(input.nextLine());

    System.out.print("단어? ");
    word.setWord(input.nextLine());

    System.out.print("뜻? ");
    word.setMeaning(input.nextLine());

    // 게시물 데이터가 보관된 Word 인스턴스의 주소를 레퍼런스 배열에 저장한다.
    wordList.add(word);
    System.out.println("저장하였습니다.");
  }


  public void listWord() {
    Word[] words = wordList.toArray();
    for (Word w : words) {
      System.out.printf("%d. %s, %s, %s, %s\n",
          w.getNo(), w.getTitle(), w.getLanguage(),
          w.getWord(), w.getMeaning());
    }
  }

  public void detailWord() {
    System.out.print("단어 번호?");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤에 남은 공백 제거

    Word word = this.wordList.get(no);  // 단어 인덱스번호 말고 단어 번호로 출력할 수 있도록 바꾸는 것

    if (word == null) {
      System.out.println("단어 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("영화명: %s\n", word.getTitle());
    System.out.printf("언어: %s\n", word.getLanguage());
    System.out.printf("단어: %s\n", word.getWord());
    System.out.printf("뜻: %s\n", word.getMeaning());

  }
}
