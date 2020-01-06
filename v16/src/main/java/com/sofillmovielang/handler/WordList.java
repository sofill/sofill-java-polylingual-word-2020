package com.sofillmovielang.handler;

import java.util.Arrays;
import com.sofillmovielang.domain.Word;

public class WordList {

  ///필드///
  static final int WORD_SIZE = 500;
  Word[] list; 
  int size = 0;

  ///생성자///
  public WordList() {
    this.list = new Word[WORD_SIZE];    
  }

  public WordList(int capacity) {
    if (capacity > WORD_SIZE && capacity <= 50000) {
      this.list = new Word[capacity];
    } else {
      this.list = new Word[WORD_SIZE];
    }
  }

  ///메서드///
  public Word[] toArray() {
    /*
    Word[] arr = new Word[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
    }
     */
    return Arrays.copyOf(this.list, this.size);
  }

  ///단어 데이터를 저장///
  public void add(Word temp) {
    if (this.size == this.list.length) {
      // 현재 배열에 객체가 꽉 찼을 때 배열을 늘려주는 기능
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = temp;
  }
}  
