package C01Basic;

//클래스의 명명규칙
// 1)반드시 public class명과 파일명이 일치해야함
// 2)일반적으로 대문자알파벳으로 시작
public class C00HelloWorld {
//    main메서드는 프로그램 실행시 가장 먼저 실행되는메서드
//    어디에서든 접근하고, 리턴값이 없는것이 특징이므로 public static void 를 앞에 붙임.
    public static void main(String[] args) {
//        java는 프로그램의 범위를 중괄호{}로 구분짓고, 모든명령문은 세미콜론으로 끝맺음.
        System.out.printf("Hello and welcome!");
/*
 *여러줄의 주석처리시에 이와같은 방법으로 주석처리 가능, 주석처리는 기복적으로 컴파일에서 제외
 */
    }
}