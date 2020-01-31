# 27 - 예외가 발생했을 때 시스템을 멈추지 않게 하는 법

예외가 발생했을 때 시스템을 멈추지 않게 하는 방법

- 예외 처리 문법을 사용할 수 있다. 
- 예외 처리 문법의 존재 의의와 사용법을 이해한다.

## 실습 소스 및 결과
- src/main/java/com/eomcs/lms/App.java
  
## 훈련 1: 명령어 실행 중 오류가 발생하더라도 시스템이 멈추지 않고 계속 실행되게 하라.

- App.java
    - 명령을 처리하는 코드를 try ~ catch ~ 블록으로 묶는다.

#### 실행 결과

다음과 같이 잘못된 형식으로 값을 입력하더라도 시스템을 멈추지 않고 계속 실행한다.
```
명령> /lesson/add
번호? 1
수업명? 자바 기초
설명? 자바 기초 문법을 배운다.
시작일? 2020-1-1
종료일? 2020-5-5
명령어 실행 중 오류 발생 : java.lang.IllegalArgumentException

명령> 
```

## 실습 소스

- src/main/java/com/eomcs/lms/App.java 변경

       if (commandHandler != null) {
        try {
          commandHandler.execute();
        } catch (Exception e) {
          System.out.printf("명령어 실행 중 오류 발생 : %s\n", e.getMessage());
        }
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
        이렇게 추가해 준다. 오류 부분에