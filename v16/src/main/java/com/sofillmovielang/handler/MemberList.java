package com.sofillmovielang.handler;

import java.util.Arrays;
import com.sofillmovielang.domain.Member;

public class MemberList {

  ///필드///
  static final int MEMBER_SIZE = 500;
  Member[] list;
  int size = 0;

  ///생성자///
  public MemberList() {
    this.list = new Member[MEMBER_SIZE];
  }

  public MemberList(int capacity) {
    if (capacity > MEMBER_SIZE && capacity <= 50000) {
      this.list = new Member[capacity];
    } else {
      this.list = new Member[MEMBER_SIZE];
    }
  }

  ///메서드///
  public Member[] toArray() {
    /*
    Member[] arr = new Member[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
    }
     */
    return Arrays.copyOf(this.list,  this.size);
  }
  
  ///멤버 데이터를 저장///
  public void add(Member temp) {
    if (this.size == this.list.length) {
      //현재 배열에 객체가 꽉 찼을 때 배열을 늘려주는 기능
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = temp;
}
}
