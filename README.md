# 김재화 202330207


# 3월 29일

# 변수와 선언
* 변수
    * 프로그램 실행중에 값을 임시 저장하기 위한 공간 (변하는 데이터)
* 변수 선언 
    * 데이터 타입 크기에 맞는 메모리 공간이 할당됨

# 리터럴과 정수 리터럴
* 리터럴(lliteral)
    * 프로그램에서 직접 표현한 값
    * 정수, 실수, 문자, 논리, 문자열 리터럴 있음
* 정수 리터럴
    * 10진수, 8진수, 16진수, 2진수 리터럴
    * 정수 리터럴은 int 형으로 컴파일
    * long 타입 리터럴은 숫자 뒤에 L 또는 l 을 붙여 표시

# 실수 리터럴 
* 소수점 형태나 지수 형태로 표현한 실수
* 실수 타입 리터럴은 double 타입으로 컴파일

# 문자 리터럴
* 단일 인용부호(' ') 로 문자 표현
* 특수문자 리터럴은 백슬래쉬(\) 로 시작

# 기본 타입 이외 리터럴
* null 리터럴 
    * 래퍼런스에 대입 사용

* 문자열 리터럴(스트링 리터럴)
    * 이중 인용부호로 묶어 표현
    * 문자 리터럴은 String 객체로자동 처리
    
    ```java
    String str = "Good";
    ```

# 상수
* 상수 선언 
    * final 키워드 사용
    * 선언 시 초깃값 지정
    * 실행 중 값 변경 불가

# var 키워드
* Java 10 부터 도입
* 기존의 변수 선언 방식 : 변수의 타입 반드시 지정
* var 키워드
    * 타입을 생략하고 변수 선언 가능
    * 컴파일러가 추론하여 변수 타입 결정
    * 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류가 난다
    ```java
    var name; // 컴파일 오류
    ```
    * var 는 지역 변수 선언에만 한정

# 타입 변환
* 타입 변환
    * 한 타입의 값을 다른 타입의 값으로 변환
* 강제 타입 변환
    * 개발자의 의도적 타입 변환
    * () 안에 개발자가 명시적으로 타입 변환 지정
    ```java
    int n = 300;
    byte b = n; // 컴파일 오류 int 타입은 byte 타입으로 자동 변환 안 됨
    ```
    
    * 강제 변환은 값 손실 우려

# 자바의 키 입력과 System.in
* System.in
    * 키보드와 직접 연결되는 표준 입력 스트림 객체

# Scanner
* Scanner 클래스
    * 읽은 바이트를 문자나 정수, 실수, 문자열 등 다양한 타입으로 변환하여 리턴
    * 객체 생성
    ```java
    Scanner scanner = new Scanner(System.in);
    ```
    
    
    ```java
    import java.util.Scanner;
    ```
    
* 주요 메소드 교과서 
    * P. 64 참조

# 식과 연산자 
* 연산 
    * 주어진 식을 계산하여 결과를 얻어내는 과정
* 산술 연산
    * 더하기(+) 빼기 (-) 곱하기 (*) 나누기 (/) 나머지 (%)

# 증감 연산
* 1 증가 혹은 감소 시키는 연산 
    a++ > a 를 1 증가하고 증가 전의 값 변환
    ++a > a 를 1 증가하고 증가된 값 반환
    a-- > a 를 1 감소하고 감소 전의 값 변환
    --a > a 를 1 감소하고 감소된 값 변환
* 대입연산자 
    * 교과서 p.69 참고
# 비교 연산, 논리 연산
* 비교연산자 : 두 개의 값을 비교하여 true/false 결과
* 논리연산자 : 두 개의 논리 값에 논리 연산, 논리 결과
    * 교과서 p.70 참고

# 비트 연산
* 비트 개념 
    * p.72 그림 2-8 참고
* 비트 논리 연산
    * 피 연산자의 각 비트들을 대상으로 하는 연산
    * p.72 그림 2-9 참고
* 시프트 연산도 p.73 2-10 표, 그림 참고

# if else 문
* 단순 if 문 
    * if 의 괄호 안에 조건식 
    * 괄호 안에 조건이 참이면 if 실행 아니면 else 실행

* 다중 if 문
    * 조건문이 너무너무 많을 경우 switch 문 활용 권장 
    * 교과서 p.77~78 참고

* 중첩 if 문 
    * if 문이나 else문, 혹은 if-else 문에 if 문이나 if-else 문을 내포 할 수 있다.

# switch 문
* switch 문은 식과 case 문의 값과 비교 
    * case의 비교 값과 일치하면 해당 case의 실행문장 수행
        * break 문 만나면 switch 문을 벗어남
    * case의 비교 값과 일치하는 것이 없으면 default 문 실행 (생략 가능)

* case 문의 값 
    * 문자, 정수, 문자열 리터럴(JDK 1.7부터) 만 허용
    * 실수 래터럴은 허용되지 않음

# 반복문
* for 문
    * 교과서 p.92~93 그림 참고

* while 문
    * 교과서 p.94~95 그림 참고
 
# 가비지 컬렉션
* ex) scanner 쓰고 마지막에 scanner.close() 를 쓰지 않으면 메모리를 잡아먹는다.

# 중첩 반복문 
* 중첩 반복
    * 반복문이 다른 반복문을 내포하는 구조

# continue 문
* 반복문을 빠져나가지 않으면서 즉시 다음 반복으로 넘어가고자 할 때 사용
```java
continue;```



## 3월 22일

# 프로그래밍 언어
우리가 하고 있는 언어는 고급 언어  

# 컴파일(.exe)
소스 파일을 컴퓨터가 이해할 수 있는 기계어로 만드는 과정  
* 자바 : .java > .class

# 기존언어의 플랫폼 종속성 
플랫폼 = 하드웨어 플랫폼 + 운영체제 플랫폼  

프로그램의 플랫폼 호환성이 없는 이유
* 기계어가 CPU마다 다름  
* 운영체제마다 API가 다름  
* 운영체제마다 실행 파일 형식이 다름 

# 자바 플랫폼 독립성 WORA
* WORA(Write Once Run Anyware)
    * 한 번 작성된 코드는 모든 플랫폼에서 바로 실행되는 자바의 특징
    * C/C++ 등 기존 언어가 가진 플랫폼 종속성 극복
        - OS H/S에 상관 없이 자바프로그램이 동일하게 실행 
    * 네트워크에 연결된 어느 클라이언트에서나 실행 
        - 웹 브라우저, 분산 환경 지원

 # 자바 API
 * JDK 에 포함된 클래스 라이브러리
 * 개발자는 API를 이용하여 쉽고 빠르게 자바 프로그램 개발

 # 자바 패키지
 * 서로 관련된 클래스들을 분류하여 묶어놓은 것
 * 계층구조로 되어있음
 * 자바 API(클래스 라이브러리) 는 JDK에 패키지 형태로 제공됨
 * 개발자 자신의 패키지 생성 가능

 # 자바 프로그램 개발 : (1) 자바 소스 편집
 * 어떤 편집기를 사용해도 무관  
    작성 후 클래스와 동일한 이름으로 저장 후 확장자는 .java

# 자바 응용의 종류 : 서블릿 응용 프로그램
* 서블릿
    * 웹 서버에서 실행되는 자바 프로그램
    * 데이터베이스 서버 및 기타 서버와 연동하는 복잡한 기능 구현 시 사용
    * 웹 서버에 의해 실행 통제 받음 

# 자바의 특성 (1)
 * 플랫폼 독립성
    * 하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성을 갖는다
 * 객체지향
    * 캡슐화, 상속, 다향성 지원
 * 클래스로 캡슐화 
    * 자바의 모든 변수나 함수는 클래스 내에 선언
    * 클래스 안에서 클래스(내부 클래스) 작성 가능
 * 소스와 클래스 파일
    * 하나의 소스파일에 여러 클래스를 작성 가능
    * 소스 파일의 이름과 public 으로 선언된 클래스 이름은 같아야 한다
    * 클래스 파일에는 하나의 클래스만 존재

# 자바의 특성 (2)
* 실행 코드 배포
    * 구성
        - 한 개의 class 파일 또는 다수의 class 파일로 구성
        - 여러 폴더에 걸쳐 다수의 클래스 파일로 구성된 경우 : jar 압축 파일로 배포
    * 자바 응용프로그램의 실행은 main() 메소드에서 시작
* 패키지
    * 서로 관련 있는 여러 클래스를 패키지로 묶어 관리
    * 패키지는 폴더 개념
* 멀티스레드
    * 여러 스레드의 동시 수행 환경 지원
        - 자바는 운영체제의 도움없이 자체적으로 멀티스레드 지원
        - C/C++ 프로그램은 멀티스레드를 위해 운영체제 API를 호출
* 가비지 컬렉션
    * 자바 언어는 메모리 할당 기능은 있어도 메모리 반환 기능 없음
        - 사용하지 않는 메모리는 자바 가상 기계에 의해 자동 변환 - 가비지 컬렉션

# 자바의 특성 (3)
* 실시간 응용프로그램에 부적합 
     * 실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문
        - 응용프로그램의 일시적 중단 발생
* 자바 프로그램은 안전
    * 타입 체크 엄격
    * 물리적 주소를 사용하는 포인터 개념 없음
* 프로그램 작성 쉬움
    * 포인터 개념이 없음 
    * 동적 메모리 변환 하지않음
    * 다양한 라이브러리 지원
* 실행속도 개선을 위한 JIT 컴파일러 사용
    * 자바는 바이트 코드를 인터프린터 방식으로 실행
        - 기계어가 실행되는 것보다 느림
    * JIT 컴파일 기법으로 실행 속도 개선
        - JIT 컴파일 - 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실행하는 기법

# 식별자
* 클래스, 변수, 상수, 메소드 등에 붙이는 이름
* 식별자의 원칙 
    [참고링크](https://www.cubrid.org/manual/ko/10.2/sql/identifier.html)
* 대소문자 구별
    - int barChart 와 int barchart 는 서로 다른 식별자 선언

# 자바의 기본 타입
* 특징 타입마다 크기가 다르기 때문에  
 다루는 값에 범위에 따라 적절한 타입을 선택하여야

# 문자열 특징 
* 기본타입에 속하지 않으며 JDK 에서 제공하는 String 클래스를 이용한다.

# 변수와 선언
* 변수
    * 프로그램 실행중에 값을 임시 저장하기 위한 공간
* 변수 선언 
    * 데이터 타입 크기에 맞는 메모리 공간이 할당됨

# 리터럴과 정수 리터럴
* 리터럴(lliteral)
    * 프로그램에서 직접 표현한 값
    * 정수, 실수, 문자, 논리, 문자열 리터럴 있음
* 정수 리터럴
    * 10진수, 8진수, 16진수, 2진수 리터럴
    
## 3월 15일

# Markdown 문법
## 폰트관련 태그

# h1 
## h2
### h3
#### h4
##### h5
###### h6


일반 글씨는 그냥 작성
개행(newline)을 하려면  
스페이스 2개입력

*이탈릭체*
**굵게**
***이텔릭, 볼드***
## 리스트(list)

1. 첫 번째
2. 두 번째
3. 세 번째

* 첫 번째
   - 두 번째
      + 세 번째


## 코드 블럭

```java
public class main(String[] args){
    System.out.println("hello world!");
}
```

```python
print("hi zz")
```

## 링크 
[구글링크](https://google.com)  
[리스트](#markdown-문법)  
[리트리버](./20230111503366.jpg)  
[절대경로](https://flexible.img.hani.co.kr/flexible/normal/850/567/imgdb/original/2023/0111/20230111503366.jpg)


## 버전
[참고링크](https://semver.org/lang/ko/)
