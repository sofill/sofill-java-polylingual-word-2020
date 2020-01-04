# 01 - 자바 애플리케이션 프로젝트 만들기

## 학습 목표

- `그레이들`을 이용하여 프로젝트 디렉토리를 구성할 수 있다.
- `그레이들`로 프로젝트를 빌드하고 실행할 수 있다.
- `아파치 메이븐` 프로젝트의 디렉토리 구조를 이해한다.

## 실습 소스 및 결과

자바 애플리케이션 프로젝트 폴더를 준비한다.

```
src/
  main/
    java/
    resources/
  test/
    java/
    resources/
gradle/
build.gradle
settings.gradle
gradlew
gradlew.bat
```

## 실습

### 작업1) 프로젝트 디렉토리를 준비하라.

로컬 Git 저장소에 자바 프로젝트 폴더를 생성한다.

```
[~/git]$ mkdir sofill-movie-lang
[~/git]$ cd sofill-movie-lang
```

프로젝트 폴더를 자바 애플리케이션 프로젝트로 초기화시킨다.
```
[~/git/sofill-movie-lang]$ gradle init
```

자바 소스 파일 외의 기타 파일을 보관할 디렉토리 생성

```
[~/git/sofill-movie-lang]$ cd src/main
[~/git/sofill-movie-lang/src/main]$ mkdir resources
[~/git/sofill-movie-lang/src/main]$ cd ../test
[~/git/sofill-movie-lang/src/test]$ mkdir resources
```

### 작업2) '그레이들'의 빌드 스크립트 파일을 편집하라.

build.gradle 파일에 다음 설정을 추가한다.

```
tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
    sourceCompatibility = '1.8'
    targetCompatibility = '1.8'
}
```

### 작업3) 프로젝트를 빌드하라.

```
[~/git/sofill-movie-lang]$ gradle build
```

### 작업4) 프로젝트를 실행하라.

```
[~/git/sofill-movie-lang]$ gradle run
```
