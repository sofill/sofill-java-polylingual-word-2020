package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Word;

public class WordList {

  private static final int WORD_SIZE = 1000;

  private Word[] list;
  private int size;

  public WordList() {
    this.list = new Word[WORD_SIZE];
  }

  public WordList(int capacity) {
    if (capacity < WORD_SIZE || capacity > 10000) {
      this.list = new Word[capacity];
    } else {
      this.list = new Word[WORD_SIZE];
    }
  }

  public Word[] toArray() {
    /*
    Word[] words = new Word[this.size];
    for (int i = 0; i < this.size; i++) {
      words[i] = this.list[i];
    }
    return words;
     */
    return Arrays.copyOf(this.list,  this.size);
  }

  public void add(Word word) {
    if (this.size == this.list.length) {  //현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려준다.
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = word;
  }

  public Word get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}
