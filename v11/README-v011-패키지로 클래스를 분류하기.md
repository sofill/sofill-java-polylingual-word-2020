# 11 - 패키지로 클래스를 분류하기

## 학습 목표

- 패키지를 이용하여 역할에 따라 클래스를 분류할 수 있다.

## 실습 소스 및 결과

- com.eomcs.lms.handler 패키지 추가
- src/main/java/com/sofillmovielang/handler/LessonHandler.java 변경
- src/main/java/com/sofillmovielang/handler/MemberHandler.java 변경
- src/main/java/com/sofillmovielang/handler/BoardHandler.java 변경
- com.eomcs.lms.domain 패키지 추가
- src/main/java/com/sofillmovielang/domain/Lesson.java 변경
- src/main/java/com/sofillmovielang/domain/Member.java 변경
- src/main/java/com/sofillmovielang/domain/Board.java 변경
- src/main/java/com/sofillmovielang/App.java 변경

## 실습

### 작업1) 데이터 타입 클래스를 별도의 패키지로 분류하라.

- 도메인 패키지 생성
    - `com.sofillmovielang.domain` 패키지 생성
- 도메인 클래스를 `domain` 패키지로 이동
    - `Movie`, `Word`, `Member` 클래스를 `com.sofillmovielang.domain` 패키지로 옮긴다.
    - 다른 패키지에서 변수에 접근할 수 있도록 접근 제어를 `public` 으로 변경
- 핸들러 클래스에 import 문 추가
    - `MovieHandler`, `WordHandler`, `MemberHandler` 클래스를 변경한다.


### 작업2) 사용자 명령을 처리하는 클래스를 별도의 패키지로 분류하라.

- 핸들러 패키지 생성
    - `com.sofillmovielang.handler` 패키지 생성
- 핸들러 클래스를 `handler` 패키지로 이동
    - `MovieHandler`, `WordHandler`, `MemberHandler` 클래스를 `com.sofillmovielang.handler` 패키지로 옮긴다.
    - 다른 패키지에서 변수에 접근할 수 있도록 접근 제어를 `public` 으로 변경
- App1.java 변경
    - 핸들러 클래스에 대해 import 문 추가
