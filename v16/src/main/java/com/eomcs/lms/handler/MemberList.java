package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Member;

public class MemberList {

  private static final int MEMBER_SIZE = 1000;

  private Member[] list;
  private int size;

  public MemberList() {
    this.list = new Member[MEMBER_SIZE];
  }

  public MemberList(int capacity) {
    if (capacity < MEMBER_SIZE || capacity > 10000) {
      this.list = new Member[capacity];
    } else {
      this.list = new Member[MEMBER_SIZE];
    }
  }

  public Member[] toArray() {
    /*
    Member[] members = new Member[this.size];
    for (int i = 0; i < this.size; i++) {
      members[i] = this.list[i];
    }
    return members;
     */
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Member member) {
    if (this.size == this.list.length) {  //현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려준다.
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = member;
  }

  public Member get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}
